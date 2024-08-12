package learning_java.learning_java;

class base27 {
    int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println("i am setting x now.");
        this.x = x;
    }
    public void printme() {
        System.out.println("i am a constructor");
    }
}

class derived extends base27 {
    int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}

public class inheritance {
    public static void main(String[] args) {
        base27 b=new base27();
        b.setX(5);
        System.out.println(b.getX());

        derived d=new derived();
        d.setX(9);
        System.out.println(d.getX());
        d.setY(7);
        System.out.println(d.getY());
    }
}
