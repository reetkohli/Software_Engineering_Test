package Map_Shapes;

import java.awt.*;

public abstract class MapShapes {
    protected Point position;
    protected Color color;

    public MapShapes(Point position, Color color) {
        this.position = position;
        this.color = color;
    }
    public abstract void draw(Graphics g);

}
