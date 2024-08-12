package learning_java;

public class variable_arguments {
    static void sum(int ...arr){
        int sum=0;
        for(int a:arr){
            sum+=a;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        sum(2,3,4,5);
        sum(3,4);
    }
}
