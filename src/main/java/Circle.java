import java.awt.*;

public class Circle extends MapShapes {
    private int radius;

    public Circle (int radius, Point position, Color color) {
        super(position, color);
        this.radius = radius;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(position.x - radius, position.y - radius, 2 * radius, 2 * radius);

    }
}
