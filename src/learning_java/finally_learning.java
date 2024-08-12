package learning_java;

public class finally_learning {

    public static int greet(){
        try {
            int a = 50;
            int b = 5;
            return a/b;
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("cleaning up resources");
        }
        return 0;
    }

    public static void main(String[] args) {
//        int k = greet();
//        System.out.println(k);
        int a =7;
        int b =9;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am finally");
            }
            b--;
        }
    }
}
