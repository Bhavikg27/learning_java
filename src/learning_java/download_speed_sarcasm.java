package learning_java;

class myThread4 extends Thread {

    public void run() {
        int i = 0;
        while (i < 100) {
            int min = 1;
            int max = 5;
            int randomInt = (int) (Math.random() * (max - min + 1)) + min;
            System.out.println("downloading game - " + i + "%");
            try {
                Thread.sleep(25L * i * randomInt);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
        System.out.println("error, try again!!!");
    }
}

class myThread5 extends Thread {

    public void run() {
        int i = 0;
        while (i <= 100) {
            System.out.println("downloading book - " + i + "%");
            i++;
        }
        System.out.println("download complete");
    }
}

public class download_speed_sarcasm {
    public static void main(String[] args) {
        myThread4 t4 = new myThread4();
        myThread5 t5 = new myThread5();
        t5.start();
        try {
            t5.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t4.start();
    }
}
