package learning_java;

class KeyPadPhone{
    void sendMessage(){
        System.out.println("Text message sent!");
    }
}

@FunctionalInterface
interface myFunctionalInterface {
    void method1();
//    void methodd2();
}

class AndroidPhone extends KeyPadPhone{
    @Override
    void sendMessage(){
        System.out.println("Message sent via WhatsApp!");
    }
    @Deprecated
    public int sum(int a, int b){
        return a+b;
    }
}

public class java_annotation{
    @SuppressWarnings("deprecation")
    public static void main(String[] args){
        AndroidPhone Samsung = new AndroidPhone();
        Samsung.sendMessage();
        Samsung.sum(2,5);
    }
}
