package learning_java;

abstract class base {
    public base() {
        System.out.println("mein base ka constructor hun");
    }

    public void SayHello() {
        System.out.println("Hello");
    }

    abstract public void greet();

    abstract public void hello();
}

class child extends base {
    @Override
    public void greet() {
        System.out.println("good morning");
    }

    @Override
    public void hello() {
        System.out.println("hi, how are you.");
    }
}

abstract class child1 extends base {
    public void th() {
        System.out.println("i am good");
    }

    @Override
    public void greet() {
        System.out.println("GM from child1");
    }
}

class childofchild1 extends child1 {
    @Override
    public void hello() {
        System.out.println("hello from childofchild1");
    }
}

public class abstract_1 {
    public static void main(String[] args) {
        childofchild1 c = new childofchild1();
        child cc = new child();
        cc.greet();
        c.SayHello();
        c.greet();
        c.th();
        cc.hello();

    }
}
