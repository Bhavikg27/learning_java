package learning_java;

class myThread1 extends Thread {
    @Override
    public void run(){
        int i=0;
        while(i<100000) {
            System.out.println("coding with CodeWithHarry");
            i++;
        }
    }
}

class myThread2 extends Thread {
    @Override
    public void run(){
        int i=0;
        while(i<100000) {
            System.out.println("using insta");
            i++;
        }
    }
}

public class threading {
    public static void main(String[] args) {
        myThread1 t1= new myThread1();
        myThread2 t2= new myThread2();
        t1.start();
        t2.start();
    }
}
