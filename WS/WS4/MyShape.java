package WS4;
import java.util.Date;

public class MyShape {
    private String type;
    private Date date = new Date();

    public MyShape(){
        this("");
    }

    public MyShape(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public Date getDate() {
        return date;
    }
}
