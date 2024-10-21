package WS5;

public class Walls extends MyShape {
    private MyRectangle2D[] walls;

    public Walls(String shapeType, int num){
        super(shapeType);
        walls = new MyRectangle2D[num];
    }

    public MyRectangle2D[] getWalls(){
        return walls;
    }

    @Override
    public void print(){
        System.out.println("Walls Print Override Method: ");
        super.print();
    }
}
