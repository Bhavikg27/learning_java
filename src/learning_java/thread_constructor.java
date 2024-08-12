package learning_java;

class mythread extends Thread{
    public mythread(String name){
        super(name);
    }

    public void run() {

            System.out.println("i am a thread");

    }
}

public class thread_constructor {
    public static void main(String[] args) {
        mythread t = new mythread("bhavik");
        mythread abc = new mythread("alphabets");
        t.start();
        abc.start();
        System.out.println("the id of the thread is " + t.getId());
        System.out.println("the name of the thread is " + t.getName());
        System.out.println("the id of the thread is " + abc.getId());
        System.out.println("the name of the thread is " + abc.getName());
    }
}
