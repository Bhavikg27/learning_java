package learning_java.learning_java;

class circle1 {

    public int radius;

    circle1(int a) {
        System.out.println("i am circle parametrized constructor");
        this.radius = a;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}

class cylinder1 extends circle1 {
    cylinder1(int r, int h) {
        super(r);
        System.out.println("i am cylinder1 parameterized constructor");
        this.height = h;
    }

    public int height;

    public double volume() {
        return Math.PI * this.radius * this.radius * this.height;
    }
}

class rectangle27 {
    int l;
    int b;
    int height;
    rectangle27(int l, int b){
        System.out.println("i am rectangle parameterized parameter");
        this.l=l;
        this.b=b;
    }
    public int parameter(){
        return 2*(b+l);
    }
}
class cuboid extends rectangle27 {
    cuboid(int length,int breadth, int h){
        super(length,breadth);
        this.height=h;
    }
    public int volume(){
        return l*b*height;
    }
}
public class practice_set_10 {
    public static void main(String[] args) {
//      mycircle abc=new mycircle(12);
        cylinder1 obj = new cylinder1(4, 7);
        System.out.println(obj.volume());
        System.out.println(obj.area());
        cuboid object=new cuboid(4,5,6);
        System.out.println(object.volume());
        System.out.println(object.parameter());
    }
}