package WS5;

public class MyRectangle2D {
    private double height;
    private double width;

    public MyRectangle2D(){
        this(0.0, 0.0);
    }

    public MyRectangle2D(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight(){
        return height;
    }

    public double getWidth(){
        return width;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void setWidth(double width){
        this.width = width;
    }
                                                                           
    public boolean compareHeight(MyRectangle2D walls){
        return height == walls.getHeight();
    }

    public boolean compareWidth(MyRectangle2D walls){
        return width == walls.getWidth();
    }

    public boolean compare(MyRectangle2D walls){
        return compareHeight(walls) && compareWidth(walls);
    }
}
