package learning_java.learning_java;

class base1{
    base1(){
        System.out.println("I am a constructor");
    }
    base1(int a){
        System.out.println("overloaded constructor - "+ a);
    }
}
class derived1 extends base1{
    derived1(){
        System.out.println("I am constructor for derived class");
    }
    derived1(int a,int b) {
        super(a);
        System.out.println("overloaded constructor of derived class - "+b);
    }
}

class childOfDerived1 extends derived1{
    childOfDerived1() {
        System.out.println("i am a child of derived1");
    }
        childOfDerived1(int a,int b,int c){
            super(a,b);
            System.out.println("i am a child of derived1 - "+c);
        }
}

public class constructors_in_inheritance {
    public static void main(String[] args) {
        //derived1 d=new derived1(2,3);
        //derived1 d1=new derived1();
        childOfDerived1 cd1=new childOfDerived1();
        childOfDerived1 cd=new childOfDerived1(1,2,3);
    }
}