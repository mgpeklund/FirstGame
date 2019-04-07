package engine.shapes;

import java.awt.*;

public abstract class Shape implements Drawable {

    protected int posX;
    protected int posY;
    public Color color;

    public Shape(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public abstract void setColor(Color color);
    public abstract void getColor();
}
