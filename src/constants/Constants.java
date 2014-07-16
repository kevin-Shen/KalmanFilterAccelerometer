package constants;

public class Constants {
    // Import delay in ms
    public static final long SLEEP_TIME = 10;

    // Complementary Filter
    public static final float FILTER_COEFFICIENT = 0.98f;

    // public static final float FILTER_COEFFICIENT = 0.5f;
    public static final float EPSILON = 0.000000001f;

    // Nanosecond to second
    public static final double NS2S = 1.0f / 1000000000.0f;

    // Butterworth / Low Pass - Q
    public static final float Q = 0.7071f;

    // Gravity Force
    public static final double EARTH_GRAVITY = 9.80665;

    // Low-Pass Filter
    public static final float LOW_PASS_ALPHA = 0.1f;

    // High-Pass Filter
    public static final float HIGH_PASS_ALPHA = 0.9f;

    // Wikipedia filter
    public static final float WIKIPEDIA_ALPHA = 0.15f;

    // TODO
    // Mean Filter
    public static final int MEAN_FILTER_WINDOW = 10;
    public static final int FINAL_MEAN_FILTER_WINDOW = 20;

    // Noise delta error
    public static final double NOISE_DELTA_ERROR = 0.2;

    // Kalman Filter
    public static final double VARIANCE = 0.05;
    public static final double FILTER_GAIN = 0.8;

    // Filenames
    // public static final String SENSOR_FILE = "log.dat";
    public static final String SENSOR_FILE = "accGravCar.dat";
    // public static final String SENSOR_FILE = "accGrav.dat";
    public static final String LINEAR_ACCELERATION = "linear_acceleration.dat";
    public static final String MAGNITUDE_ACCELERATION = "magnitude_acceleration.dat";
    public static final String GPS_DATA = "gps_data.dat";
}