//package ball.model;
//
//import ball.model.Ball;
//import ball.ui.BallWorld;
//import org.junit.Test;
//
//import static ball.BallTestHarness.*;
//
//public class BounceTest {
//    @Test
//    public void shouldGoDown() throws Exception {
//        Ball bouncingBall = BallFactory.Ball(0, 100,50, Bounce.DOWN);
//
//        bouncingBall.update();
//
//        assertCenterYCoordinateIs(oneStepDownFrom(100), bouncingBall);
//    }
//
//    @Test
//    public void shouldGoUpAfterHittingTheBottom() throws Exception {
//        int theBottomEdge = BallWorld.BOX_HEIGHT - Ball.DEFAULT_RADIUS;
//        Ball bouncingBall = BallFactory.bouncingBall(0, theBottomEdge, Bounce.DOWN);
//
//        bouncingBall.update();
//
//        assertCenterYCoordinateIs(oneStepUpFrom(theBottomEdge), bouncingBall);
//    }
//
//    @Test
//    public void shouldGoUp() throws Exception {
//        Ball bouncingBall = BallFactory.bouncingBall(0, 100, Bounce.UP);
//
//        bouncingBall.update();
//
//        assertCenterYCoordinateIs(oneStepUpFrom(100), bouncingBall);
//    }
//
//    @Test
//    public void shouldGoDownAfterHittingTheTop() throws Exception {
//        int theTopEdge = Ball.DEFAULT_RADIUS;
//        Ball bouncingBall = BallFactory.bouncingBall(0, theTopEdge, Bounce.UP);
//
//        bouncingBall.update();
//
//        assertCenterYCoordinateIs(oneStepDownFrom(theTopEdge), bouncingBall);
//    }
//}
