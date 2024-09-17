package learning_java;

public class Back_Tracking {
    public static void main(String[] args) {
        String str = "ABC";
        printPermutations(str,"",0);
    }
    public static  void printPermutations(String str, String permutation,int index){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i+1);
            printPermutations(newstr,permutation+currChar,index);
        }

    }
}
