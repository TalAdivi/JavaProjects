public class Line2D {

   private Point2D first;
   private Point2D sec;

    public Line2D(Point2D f, Point2D s){
        setFirst(f);
        setSec(s);
    }

    public Point2D getFirst() {
        return first;
    }

    public void setFirst(Point2D first) {
        this.first = first;
    }

    public Point2D getSec() {
        return sec;
    }

    public void setSec(Point2D sec) {
        this.sec = sec;
    }

    public void details(){
        System.out.println("[");
        first.details();
        System.out.println(" ,");
        sec.details();
        System.out.println("]");
    }

    public String isParallel(Line2D other){
        if(Math.abs(this.getLineAngle()) == Math.abs(other.getLineAngle())){
            return "Is Parallel";
        }
        return "Not Parallel";
    }

    public Double getLineAngle(){
        Double angle = (first.getY() - sec.getY()) / (first.getX() - sec.getX());
        System.out.println("Angle is " + angle);

        return angle;

    }

    public Double getLength(){
        return Math.sqrt(Math.pow(first.getX() - sec.getX(),2) + Math.pow(first.getY() - sec.getY(),2));
    }
}
