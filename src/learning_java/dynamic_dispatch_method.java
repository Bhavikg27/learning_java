package learning_java.learning_java;

class phone {
    public void on() {
        System.out.println("turning on phone...");
    }
    public void showTime() {
        System.out.println("displaying time...");
    }
}

class smartPhone extends phone {
    public void music() {
        System.out.println("playing music...");
    }
    public void on() {
        System.out.println("turning on smart phone...");
    }
}

public class dynamic_dispatch_method {
    public static void main(String[] args) {
//      phone obj=new phone();
//      smartPhone newObj=new smartPhone();
//      obj.name();
        phone obj=new smartPhone();
        obj.showTime();
        obj.on();
    }
}