package WS.WS2;

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

    public void print(){
        System.out.println("Height: " + height + ", Width:  " + width);
    }
}
