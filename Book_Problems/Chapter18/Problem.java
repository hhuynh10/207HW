public class Problem {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("m(%d) = %.6f%n", i, m(i));
        }
    }

    public static double m(int i) {
        if (i == 1) {
            return 1;
        }
        else {
            return 1.0 / i + m(i - 1);
        }
    }
}