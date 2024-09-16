package WS.WS3;

import java.util.Scanner;

public class Test_hayden_app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Walls wallArr = new Walls();
        MyRectangle2D[] walls = wallArr.getWalls();

        for (int i = 0; i < walls.length; i++){
            System.out.println("Input wall " + (i+1) +" stats!");
            System.out.print("Enter height: ");
            double height = input.nextDouble();
            System.out.print("Enter width: ");
            double width = input.nextDouble();
            walls[i] = new MyRectangle2D(height, width);
        }

        boolean sameHeight = walls[0].compareHeight(walls[1]) &&
                             walls[0].compareHeight(walls[2]) &&
                             walls[0].compareHeight(walls[3]);

        boolean wallsMatch = walls[0].compare(walls[2]) && walls[1].compare(walls[3]);

        if (sameHeight && wallsMatch) {
            System.out.println("You can build a house!");
        } else {
            System.out.println("You can NOT build a house!");
        }

        input.close();
    }
}
