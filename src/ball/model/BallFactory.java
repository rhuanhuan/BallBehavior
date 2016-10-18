package ball.model;


public class BallFactory {

    public static Ball[] all() {
        return new Ball[]{
                bouncingElastingBall(75, 50, 50,Bounce.DOWN),
        };
    }

    public static Ball bouncingElastingBall(int centerX, int centerY, int radius, int direction) {
        return new Ball(centerX, centerY, radius,direction);
    }

}
