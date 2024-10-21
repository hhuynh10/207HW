public class Main {
    public static void main(String[] args) {
        // No-arg constructor: Current time
        Time currentTime = new Time();
        System.out.println("Current Time: " + currentTime.displayTime());

        // Constructor with elapsed time in milliseconds (5,000,000 ms)
        Time elapsedTime = new Time(5000000L);
        System.out.println("Elapsed Time: " + elapsedTime.displayTime());

        // Constructor with specific hour, minute, and second
        Time specificTime = new Time(10, 30, 45);
        System.out.println("Specific Time: " + specificTime.displayTime());

        // Using setTime to set a new time using an elapsed time
        elapsedTime.setTime(5555000L);
        System.out.println("Updated Elapsed Time: " + elapsedTime.displayTime());
    }
}