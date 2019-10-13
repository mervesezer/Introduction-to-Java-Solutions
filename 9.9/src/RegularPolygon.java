public class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    public RegularPolygon() {
        setN(3);
        setSide(1);
        setX(0);
        setY(0);
    }

    public RegularPolygon(int n, double side) {
        this.setN(n);
        this.setSide(side);
        setX(0);
        setY(0);
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.setN(n);
        this.setSide(side);
        this.setX(x);
        this.setY(y);

    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter() {
        return side * n;
    }

    public double getArea() {
        return (n * (side * side)) / 4 * Math.tan(Math.PI / n);
    }


}







