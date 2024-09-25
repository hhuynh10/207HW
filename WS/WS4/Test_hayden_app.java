package WS4;
import java.util.Scanner;
public class Test_hayden_app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of walls: ");
        int num = input.nextInt();
        input.nextLine();
        
        Walls wallArr = new Walls(num);
        MyRectangle2D[] walls = wallArr.getWalls(); 

        for (int i = 0; i < walls.length; i++){
            System.out.println("Enter each wall stats!");
            System.out.print("Enter wall " + (i+1) + " shape: ");
            String type = input.nextLine();
            System.out.print("Enter wall " + (i+1) + " height: ");
            double height = input.nextDouble();
            System.out.print("Enter wall " + (i+1) + " width: ");
            double width = input.nextDouble();
            input.nextLine();
            
            walls[i] = new MyRectangle2D(height, width, type);
        }

        for (int i = 0; i < walls.length-1; i++){
            if (!walls[i].compareHeight(walls[i+1]) || walls[i].getType() != walls[i+1].getType()) System.out.println("false");
            else System.out.println("true");
        }

        walls[0].printShapeInfo();
        input.close();
    }
}
