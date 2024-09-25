package WS4;

public class Walls {
    private MyRectangle2D[] walls;

    public Walls(int num){
        walls = new MyRectangle2D[num];
    }

    public MyRectangle2D[] getWalls(){
        return walls;
    }
}