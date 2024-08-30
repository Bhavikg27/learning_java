package learning_java;

@FunctionalInterface
interface demoano{
    void meth1(int a);
//    void meth2();
}

/*class BhavikFunc implements demoano{
    @Override
    public void meth1() {
        System.out.println("this is a method 1");
    }
}*/

//class anonyDemo implements demoano{
//    public void display(){
//        System.out.println("hello");
//    }
//
//    @Override
//    public void meth1() {
//        System.out.println("I am meth 1");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("I am meth 2");
//    }
//}
public class lambda {

    public static void main(String[] args) {

//        demoano ad = new anonyDemo();
//        ad.meth1();

//        Anonymous class
        /*
        demoano obj = new demoano() {
            @Override
            public void meth1() {
                System.out.println("I am meth 1");
            }

            @Override
            public void meth2() {
                System.out.println("I am meth 2");
            }
        };
        obj.meth1();
        */

//        demoano obj = new BhavikFunc();
//        obj.meth1();

//        Lambda expressions

        /*
        demoano obj = (a)->{System.out.println("i am method " +a);};
        obj.meth1(1);
        */

    }
}
