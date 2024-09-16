package WS.WS3;

public class Walls {
    private MyRectangle2D[] walls;

    public Walls(){
        walls = new MyRectangle2D[4];
    }

    public MyRectangle2D[] getWalls(){
        return walls;
    }
}
