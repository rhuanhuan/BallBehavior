//package ball;
//
//import ball.model.Bounce;
//import ball.model.Elast;
//
//import static org.junit.Assert.assertEquals;
//
//public class BallTestHarness {
//    public static void assertCenterYCoordinateIs(int expectedCenterY, Ball ball) {
//        assertEquals("Ball is at the wrong y-coordinate!", expectedCenterY, ball.center().y);
//    }
//
//    public static int oneStepDownFrom(int centerY) {
//        return centerY + Bounce.MOVEMENT_SPEED;
//    }
//
//    public static int oneStepUpFrom(int centerY) {
//        return centerY - Bounce.MOVEMENT_SPEED;
//    }
//
//
//    public static void assertRadiusIs(int expectedRadius, Ball ball) {
//        assertEquals("Ball does not have the correct radius", expectedRadius, ball.radius());
//    }
//
//    public static int oneStepInwardsFrom(int radius) {
//        return radius - Elast.GROWTH_RATE;
//    }
//
//    public static int oneStepOutwardsFrom(int radius) {
//        return radius + Elast.GROWTH_RATE;
//    }
//}
