package bwg;

public class Delta {
    private double x, y;

    public Delta(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX(){ return this.x; }
    public double getY(){ return this.y; }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
}
