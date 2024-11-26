import Map_Shapes.MapShapes;

import java.awt.*;
public class Square extends MapShapes {
    private int side;
    public Square(int side, Point position, Color color){
        super(position, color);
        this.side = side;


    }
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(position.x, position.y, side,side);
    }


}
