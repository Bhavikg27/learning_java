package learning_java;

class goodMorning extends Thread {
    public void run() {
        int i=1;
        while (i<=1000) {
            System.out.println("good morning");
            i++;
        }
    }
}

class welcome extends Thread {
    public void run() {
        int i=1;
        while (i<=1000) {
            System.out.println("welcome");
            i++;
        }
    }
}

public class thread_practice {
    public static void main(String[] args) {
        goodMorning gm = new goodMorning();
        welcome we = new welcome();

        we.setPriority(10);
        gm.setPriority(1);
        System.out.println(we.getPriority());
        System.out.println(gm.getPriority());
        System.out.println(we.getState());
        System.out.println(gm.getState());
        gm.start();
        we.start();
        System.out.println(we.getState());
        System.out.println(gm.getState());

    }
}
