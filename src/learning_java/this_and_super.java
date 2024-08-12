package learning_java;

class ekClass {
    int a;

    ekClass(int v) {
        this.a = v;
    }

    public int getA() {
        return a;
    }

    public int returnOne() {
        return 1;
    }
}

class doClass extends ekClass {
    doClass(int c) {
        super(c);
        System.out.println("i am a constructor of doClass");
    }
}

public class this_and_super {

    public static void main(String[] args) {
        ekClass e = new ekClass(7);
        doClass d = new doClass(8);
        System.out.println(d.getA());
    }
}