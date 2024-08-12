package learning_java.learning_java;

interface bicycle {
    int a = 45;

    void applybrakes(int decrement);

    void speedup(int increment);
}

interface horn {
    void hornabc();

    void hornde();
}

class avoncycle implements bicycle, horn {
    void horn() {
        System.out.println("trnn trnn");
    }

    public void applybrakes(int decrement) {
        System.out.println("applying brake");
    }

    public void speedup(int increment) {
        System.out.println("accelerating");
    }

    @Override
    public void hornabc() {
        System.out.println("abc abc abc");
    }

    @Override
    public void hornde() {
        System.out.println("de de de");
    }
}

public class interfaces {
    public static void main(String[] args) {
        avoncycle mycycle = new avoncycle();
        mycycle.applybrakes(2);
        mycycle.speedup(4);
        System.out.println(mycycle.a);
        mycycle.horn();
        mycycle.hornabc();
        mycycle.hornde();
    }
}
