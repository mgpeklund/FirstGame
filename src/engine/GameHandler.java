package engine;

import org.lwjgl.opengl.GL;
import static org.lwjgl.opengl.GL11.glClearColor;

public class GameHandler {
    protected Window window;

    /**
     * Class to handle the game
     */
    public GameHandler(){
        window = new Window(800,600, "Game Title");
    }

    /* PUBLIC METHODS */

    /**
     *
     */
    public void run() {
        loop();
    }

    /**
     *
     *
     */
    public void init() {
        window.create();
    }

    /* PRIVATE METHODS */

    private void loop() {



        GL.createCapabilities();

        glClearColor(1.0f,0.0f,0.0f,0.0f);
        while (!window.closed()) {
            window.update();
        }
    }
}
