public class LinearEquation {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;

    public LinearEquation(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }


    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public int getE() {
        return e;
    }

    public int getF() {
        return f;
    }

    public boolean isSolvable() {
        if (a * d - b * c != 0) {
            return true;
        } else
            System.out.println("The equation has no solution");
        return false;
    }

    public int getX() {

        return (e * d - b * f) / (a * d - b * c);
    }

    public int getY() {

        return (a * f - e * c) / (a * d - b * c);
    }


}
