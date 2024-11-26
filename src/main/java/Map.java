import java.awt.*;
import java.util.ArrayList;


public class Map extends Canvas {
    private ArrayList<MapShapes> map_shape= new ArrayList<>();


    public Map(){
        map_shape.add(new Circle(2, new Point(200,200), new Color(0,40,100)));
        map_shape.add(new Circle(3, new Point(200,200), new Color(100,0,0)));
        map_shape.add(new Square(3, new Point(200,200), new Color(0,0,0)));

    }
    public void paint(Graphics g) {
        for (MapShapes m: map_shape) m.draw(g);

    }


}
