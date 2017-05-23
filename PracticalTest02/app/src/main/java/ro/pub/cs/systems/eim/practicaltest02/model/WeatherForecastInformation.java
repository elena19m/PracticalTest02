package ro.pub.cs.systems.eim.practicaltest02.model;

public class WeatherForecastInformation {

    private String time;
    private String value;
    private long crt_time;

    public WeatherForecastInformation() {
        this.time = null;
        this.value = null;
        this.crt_time = System.currentTimeMillis();
    }

    public WeatherForecastInformation(String time, String value) {
        this.time = time;
        this.value = value;
        this.crt_time = System.currentTimeMillis();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public long getCrtTime() {
        return crt_time;
    }

    public void setCrtTime(long crt_time) {
        this.crt_time = crt_time;
    }

    @Override
    public String toString() {
        return "" +
                "Time:'" + time + '\n' +
                "Value:'" + value + '\n'
               ;
    }

}
