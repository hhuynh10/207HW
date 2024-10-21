package WS5;
import java.util.Scanner;

public class Test_hayden_app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter shape type: ");
        String shapeType = input.nextLine();

        int num;
        switch(shapeType.toLowerCase()){
            case "square":
            case "rectangle":
                num = 4;
                break;
            case "pentagon":
                num = 5;
                break;
            case "hexagon":
                num = 6;
                break;
            default:
                num = 0;
        }

        Walls wallArr = new Walls(shapeType, num);
        MyRectangle2D[] walls = wallArr.getWalls();

        for (int i = 0; i < walls.length; i++) {
            System.out.println("Enter each wall's stats!");
            System.out.print("Enter wall " + (i + 1) + " height: ");
            double height = input.nextDouble();
            System.out.print("Enter wall " + (i + 1) + " width: ");
            double width = input.nextDouble();
        
            try {
                if (height < 0 || width < 0) {
                    throw new IllegalArgumentException("Height and width must be non-negative. Provided height: " + height + ", width: " + width);
                }
                walls[i] = new MyRectangle2D(height, width);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                i--;
            }
        }

        for (int i = 0; i < walls.length-1; i++){
            if (!walls[i].compareHeight(walls[i+1])) System.out.println("false");
            else System.out.println("true");
        }

        wallArr.print();

        input.close();
    }
}
