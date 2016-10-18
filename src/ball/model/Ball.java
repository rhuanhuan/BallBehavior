package ball.model;

import java.awt.*;

public class Ball {
    protected int x;
    protected int y;
    protected int radius;
    int bounceDirction;
    private int maxRadius = 50;

    protected Ball(int x, int y, int radius, int bounceDirection) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.bounceDirction=bounceDirection;
    }
    protected Ball(int x, int y, int radius,int bounceDirection,int maxRadius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.maxRadius=maxRadius;
        this.bounceDirction=bounceDirection;
    }

    public int radius() {
        return radius;
    }

    public Point center() {
        return new Point(x, y);
    }

    public void bounce(){
        Behavior bounce =new Bounce(this);
        bounce.update();
        this.y = bounce.getY();
    }
    public void elast(){
        Behavior elast=new Elast(this);
        elast.update();
    }

    public void update(){
        this.bounce();
        this.elast();
    }

}
