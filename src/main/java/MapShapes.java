import java.awt.*;
import java.io.IOException;

public abstract class MapShapes extends LocationSystem {
    protected int GPS_ID;
    protected Point position=LocationSystem.getCoords(GPS_ID);
    protected Color color;

    public MapShapes(Point position, Color color) throws IOException {
        this.position = position;
        this.color = color;
    }
    public abstract void draw(Graphics g);

}
