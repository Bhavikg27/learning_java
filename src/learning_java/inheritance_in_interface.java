package learning_java.learning_java;

interface sampleinterface{
    void meth1();
    void meth2();
}
interface childsampleinterface  extends sampleinterface{
    void meth3();
    void meth4();
}
class mysampleclass implements childsampleinterface{
    @Override
    public void meth1() {
        System.out.println("meth 1");
    }

    @Override
    public void meth2() {
        System.out.println("meth 2");
    }

    @Override
    public void meth3() {
        System.out.println("meth 3");
    }

    @Override
    public void meth4() {
        System.out.println("meth 4");
    }
}
public class inheritance_in_interface {
    public static void main(String[] args) {

    }
}
