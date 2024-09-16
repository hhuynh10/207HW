package WS.WS2;

import java.util.Scanner;

public class Test_hayden_app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many rectangles? ");
        int num = input.nextInt();

        MyRectangle2D[] recs = new MyRectangle2D[num];
        
        for (int i = 0; i < recs.length; i++){
            System.out.println("Input rectangle " + (i+1) +" stat!");
            System.out.print("Enter height: ");
            double height = input.nextDouble();
            System.out.print("Enter width: ");
            double width = input.nextDouble();
            recs[i] = new MyRectangle2D(height, width);
        } 

        for (int i = 0; i < recs.length; i++){
            System.out.println("Stats of rectangle " + (i+1));
            recs[i].print();
        }

        input.close();
    }
}
