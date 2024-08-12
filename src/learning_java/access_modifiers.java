package learning_java;

class c1{
    public int x = 1;
    protected int y = 2;
    int z =3;
    private int a = 4;
    public int c = a*5;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
        System.out.println(c);
    }
}



public class access_modifiers {
    public static void main(String[] args) {
        c1 c= new c1();
        c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        // System.out.println(c.a);  CANT USE BECAUSE ACCESS MODIFIER USED IS PRIVATE
        System.out.println(c.c);
    }
}
