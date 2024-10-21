public class MyInteger {
    private int value;

    public MyInteger (int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public boolean isPrime() {
        if (value <= 1) return false;
        for (int i = 2; i <= Math.sqrt(value); i++){
            if (value % i == 0) return false;
        }
        return true;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public static boolean isPrime(int value) {
        if (value <= 1) return false;
        for (int i = 2; i <= Math.sqrt(value); i++){
            if (value % i == 0) return false;
        }
        return true;
    }

    public static boolean isEven(MyInteger value) {
        return value.getValue() % 2 == 0;
    }

    public static boolean isOdd(MyInteger value) {
        return value.getValue() % 2 != 0;
    }

    public static boolean isPrime(MyInteger value) {
        if (value.getValue() <= 1) return false;
        for (int i = 2; i <= Math.sqrt(value.getValue()); i++){
            if (value.getValue() % i == 0) return false;
        }
        return true;
    }

    public boolean equals(int num){
        return num == value;
    }

    public boolean equals(MyInteger num){
        return num.equals(value);
    }

    public static int parseInt(char[] arrChar) {
        String res = "";
        for (int i = 0; i < arrChar.length; i++){
            res += arrChar[i];
        }

        return Integer.parseInt(res);
    }

    public static int parseInt(String str){
        return Integer.parseInt(str);
    }
}
