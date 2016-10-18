package ball.model;

public class Elast implements Behavior {
    public static final int GROWTH_RATE = 2;
    static final int GROW = 1;
    static final int SHRINK = -1;

    private int growthDirection;
    private int maxRadius=50;
    Ball ball;
    public Elast(Ball ball) {
        this.ball=ball;
    }

    @Override
    public void update() {
        growthDirection = reverseGrowthDirectionIfNecessary();
        ball.radius = next();
    }

    @Override
    public int getY() {
        return 0;
    }

    /***********************************************************************************
     *
     * Do not change Elastic ALGORITHM below.
     *
     ***********************************************************************************/

    private int reverseGrowthDirectionIfNecessary() {
        if (growingTooBig() || shrinkingTooSmall()) {
            return switchDirection();
        }

        return this.growthDirection;
    }

    private boolean shrinkingTooSmall() {
        return radius <= 0 && shrinking();
    }

    private boolean growingTooBig() {
        return radius >= maxRadius && growing();
    }

    private int switchDirection() {
        return growing() ? SHRINK : GROW;
    }

    private int next() {
        return radius + (GROWTH_RATE * growthDirection);
    }

    private boolean shrinking() {
        return growthDirection == SHRINK;
    }

    private boolean growing() {
        return growthDirection == GROW;
    }
}
