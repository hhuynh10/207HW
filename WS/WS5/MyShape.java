package WS5;
import java.util.Date;

public class MyShape {
    private String shapeType;
    private Date date = new Date();

    public MyShape(){
        this("");
    }

    public MyShape(String shapeType){
        this.shapeType = shapeType;
    }

    public String getShapeType(){
        return shapeType;
    }

    public Date getDate(){
        return date;
    }

    public void print(){
        System.out.println("Shape Type: " + getShapeType());
        System.out.println("Shape Date: " + getDate());
    }
}
