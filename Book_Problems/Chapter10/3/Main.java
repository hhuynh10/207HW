public class Main {
    public static void main(String[] args) {
        // Create MyInteger objects
        MyInteger num1 = new MyInteger(10);
        MyInteger num2 = new MyInteger(15);
        MyInteger num3 = new MyInteger(29);
        MyInteger num4 = new MyInteger(1);
        MyInteger num5 = new MyInteger(-5);

        // Test isEven and isOdd
        System.out.println(num1.getValue() + " is even: " + num1.isEven()); // true
        System.out.println(num1.getValue() + " is odd: " + num1.isOdd()); // false
        System.out.println(num2.getValue() + " is even: " + num2.isEven()); // false
        System.out.println(num2.getValue() + " is odd: " + num2.isOdd()); // true

        // Test isPrime
        System.out.println(num1.getValue() + " is prime: " + num1.isPrime()); // false
        System.out.println(num2.getValue() + " is prime: " + num2.isPrime()); // false
        System.out.println(num3.getValue() + " is prime: " + num3.isPrime()); // true
        System.out.println(num4.getValue() + " is prime: " + num4.isPrime()); // false
        System.out.println(num5.getValue() + " is prime: " + num5.isPrime()); // false

        // Test static methods
        System.out.println("Static method: " + MyInteger.isEven(8)); // true
        System.out.println("Static method: " + MyInteger.isOdd(7)); // true
        System.out.println("Static method: " + MyInteger.isPrime(13)); // true

        // Test parseInt with char array
        char[] arrChar = {'1', '2', '3', '4'};
        int parsedValueFromCharArray = MyInteger.parseInt(arrChar);
        System.out.println("Parsed integer from char array: " + parsedValueFromCharArray); // 1234

        // Test parseInt with String
        String strValue = "5678";
        int parsedValueFromString = MyInteger.parseInt(strValue);
        System.out.println("Parsed integer from string: " + parsedValueFromString); // 5678

        // Test equals method
        System.out.println("num1 equals 10: " + num1.equals(10)); // true
        System.out.println("num1 equals num2: " + num1.equals(num2)); // false
        System.out.println("num3 equals 29: " + num3.equals(29)); // true
        System.out.println("num3 equals num4: " + num3.equals(num4)); // false
    }
}
