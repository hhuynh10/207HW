import java.util.Calendar;

public class Time {
    // Data fields representing the hour, minute, and second
    private int hour;
    private int minute;
    private int second;

    // No-arg constructor: Creates a Time object for the current time
    public Time() {
        // Get the current time using the Calendar class
        Calendar calendar = Calendar.getInstance();
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);
    }

    // Constructor that takes elapsed time in milliseconds since Jan 1, 1970
    public Time(long elapsedTime) {
        setTime(elapsedTime);
    }

    // Constructor that takes specified hour, minute, and second
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Getters for the hour, minute, and second fields
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    // Method to set a new time based on the elapsed time in milliseconds
    public void setTime(long elapsedTime) {
        // Convert milliseconds to total seconds
        long totalSeconds = elapsedTime / 1000;

        // Compute the current second, minute, and hour
        this.second = (int) (totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        this.minute = (int) (totalMinutes % 60);
        long totalHours = totalMinutes / 60;
        this.hour = (int) (totalHours % 24);
    }

    // Method to display the time in HH:MM:SS format
    public String displayTime() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
