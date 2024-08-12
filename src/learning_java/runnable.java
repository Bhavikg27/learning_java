package learning_java;

class mythreadrunnable1 implements Runnable {
    public void run() {
        int i = 0;
        while (i<=10000) {
            System.out.println("I AM A THREAD 1 NOT A THREAT 1");
            i++;
        }
    }

}

class mythreadrunnable2 implements Runnable {
    public void run() {
        int i = 0;
        while (i<=10000) {
            System.out.println("I AM A THREAD 2 NOT A THREAT 2");
            i++;
        }
    }
}

public class runnable {

    public static void main(String[] args) {
        mythreadrunnable1 bullet1 = new mythreadrunnable1();
        Thread gun1 = new Thread(bullet1, "bhavik");

        mythreadrunnable2 bullet2 = new mythreadrunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
        System.out.println(gun1.getName());
    }
}
