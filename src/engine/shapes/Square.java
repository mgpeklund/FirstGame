package engine.shapes;

import java.awt.*;

public abstract class Square extends Shape{
    public Square(int posX, int posY) {
        super(posX, posY);
    }

    public void draw() {

    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }
}
