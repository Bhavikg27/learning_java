package learning_java;

class myThread11 extends Thread {
    public myThread11(String name) {
        super(name);
    }

    public void run() {
        while(true) {
            System.out.println("i am a thread " + this.getName());
        }
    }
}

public class thread_Priorities {
    public static void main(String[] args) {
        // ready queue: T1 T2 T3 T4 T5
        myThread11 T1= new myThread11("aaaaa ()most important");
        myThread11 T2= new myThread11("bbbbb");
        myThread11 T3= new myThread11("ccccc");
        myThread11 T4= new myThread11("ddddd");
        myThread11 T5= new myThread11("eeeee");

        T1.setPriority(Thread.MAX_PRIORITY);
        T2.setPriority(Thread.NORM_PRIORITY);
        T3.setPriority(Thread.MIN_PRIORITY);
        T4.setPriority(Thread.MIN_PRIORITY);
        T5.setPriority(Thread.MIN_PRIORITY);

        T1.start();
        T2.start();
        T3.start();
        T4.start();
        T5.start();
    }
}
