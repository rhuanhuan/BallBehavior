package ball.model;

import ball.ui.BallWorld;

public class Bounce implements Behavior {
    public static final int MOVEMENT_SPEED = 12;

    static final int DOWN = 1;
    static final int UP = -1;

    private int direction;
    private int y;

    public int getY() {
        return y;
    }

    private int radius;


    Bounce(int y,int direction,int radius) {
        this.y=y;
        this.radius=radius;
        this.direction=direction;
    }

    @Override
    public void update() {
        direction = reverseDirectionIfNecessary();
        y = move();
    }

    /***********************************************************************************
     *
     * Do not change Bouncing ALGORITHM below.
     *
     ***********************************************************************************/

    private int reverseDirectionIfNecessary() {
        if (movingTooHigh() || movingTooLow()) {
            return switchDirection();
        }

        return this.direction;
    }

    private boolean movingTooLow() {
        return y + radius >= BallWorld.BOX_HEIGHT && movingDown();
    }

    private boolean movingTooHigh() {
        return y - radius <= 0 && movingUp();
    }

    private int switchDirection() {
        return movingDown() ? UP : DOWN;
    }

    private int move() {
        return y + (MOVEMENT_SPEED * direction);
    }

    private boolean movingDown() {
        return direction == DOWN;
    }

    private boolean movingUp() {
        return direction == UP;
    }
}
