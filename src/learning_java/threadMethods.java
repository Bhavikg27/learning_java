package learning_java;

class myThread12 extends Thread {

    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("i am thread 12's " + this.getName() + "  " + i + "%");
            try {
                Thread.sleep(10*i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
        System.out.println("error, try again!!!");
    }
}

class myThread13 extends Thread {

    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("i am thread 13's " + this.getName() + "  " + i + "%");
            i++;
        }
    }
}

public class threadMethods {
    public static void main(String[] args) {
        myThread12 t12 = new myThread12();
        myThread13 t13 = new myThread13();
        t12.start();
//        try{
//            t1.join();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
        t13.start();
    }
}
