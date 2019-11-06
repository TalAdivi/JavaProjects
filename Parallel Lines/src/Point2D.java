
public class Point2D {
    private Double x;
    private Double y;

    public Point2D(Double X, Double Y){
        setX(X);
        setY(Y);
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public void details(){
        System.out.println("(" +getX()+ ")" + "," + "(" + getY() + ")" );
    }
}
