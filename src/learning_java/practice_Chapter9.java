package learning_java.learning_java;

class cylinder {
    private float h;
    private float r;

    public float  getH()         { return h; }

    public void   setH(float h)  { this.h = h; }

    public float  getR()         { return r; }

    public void   setR(float r)  { this.r = r; }

    public double csa()          { return 2 * Math.PI * r * h; }

    public double tsa()          { return csa() + (2 * Math.PI * r * r); }

    public cylinder(float h, float r) {
        this.h = h;
        this.r = r;
    }

    public double volume()       { return Math.PI * r * r * h; }
}

class rectangle1 {
    private final int length;
    private final int breadth;

    public rectangle1() {
        this.length = 4;
        this.breadth = 5;
    }

    public rectangle1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class practice_Chapter9 {
    public static void main(String[] args) {
        cylinder myCylinder = new cylinder(24,7);
        System.out.println(myCylinder.csa());
        System.out.println(myCylinder.tsa());
        System.out.println(myCylinder.volume());
        rectangle1 bh = new rectangle1();
        System.out.println(bh.getBreadth());
        System.out.println(bh.getLength());
    }
}