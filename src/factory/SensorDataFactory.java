package factory;

import bus.BusProvider;
import com.google.common.eventbus.EventBus;
import io.Importer;

import java.util.List;

public class SensorDataFactory {

    private List<String> sensorDataLines;
    private EventBus bus;

    private final long SLEEP_TIME = 1000;

    public SensorDataFactory() {
        Importer importer = new Importer();
        sensorDataLines = importer.readData();
        registerBus();
        startFactory();
    }

    private void registerBus() {
        bus = BusProvider.getInstance();
    }

    private void startFactory() {
        Thread thread = new Thread() {
            public void run() {
                for (String string : sensorDataLines) {
                    SensorSingleData sensorSingleData = proccessLine(string);
                    bus.post(sensorSingleData);

                    // Simulate GPS intervals
                    // pauseThread(SLEEP_TIME);
                }
            }
        };
        thread.start();
    }

    private SensorSingleData proccessLine(String sensorLine) {
        String[] sensorParts = sensorLine.split(" ");

        SensorSingleData sensorSingleData = new SensorSingleData();

        sensorSingleData.setNumber(Long.valueOf(sensorParts[0]));
        sensorSingleData.setDt(Long.valueOf(sensorParts[1]));

        sensorSingleData.setAccX(Double.valueOf(sensorParts[2]));
        sensorSingleData.setAccY(Double.valueOf(sensorParts[3]));
        sensorSingleData.setAccZ(Double.valueOf(sensorParts[4]));

        return sensorSingleData;
    }

    private void pauseThread(long sleepTime) {
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
