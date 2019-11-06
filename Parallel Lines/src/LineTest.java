public class LineTest {
    public static void main(String[] args){
        Line2D one = new Line2D(new Point2D(2.0,10.0), new Point2D(3.0,11.0));
        Line2D two = new Line2D(new Point2D(4.0,8.0), new Point2D( 2.0,10.0));
        System.out.println(two.getLength());
//        one.getLineAngle();
//        two.getLineAngle();


        System.out.println(one.isParallel(two));
    }
}
