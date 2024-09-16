package WS.WS1;

import java.util.Scanner;

public class Test_hayden_app{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input rectangle stat!");
        System.out.print("Enter height: ");
        double height = input.nextDouble();
        System.out.print("Enter width: ");
        double width = input.nextDouble();

        MyRectangle2D rec = new MyRectangle2D(height, width);
        rec.print();

        System.out.println("Input new rectangle stat!");
        System.out.print("Enter new height: ");
        height = input.nextDouble();
        System.out.print("Enter new width: ");
        width = input.nextDouble();

        rec.setHeight(height);
        rec.setWidth(width);

        rec.print();
        input.close();
    }
}