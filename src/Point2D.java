public class Point2D extends java.awt.geom.Point2D.Double {

    Point2D(double d1, double d2){
        super(d1,d2);
    }

    @Override
    public String toString() {
        return "(" + String.format("%.2f", this.getX()) + "; " + String.format("%.2f", this.getY()) + ")";
    }
}
