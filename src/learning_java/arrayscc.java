package learning_java;

public class arrayscc {
    public static void main(String[] args){
        int [] arr ={1,2,3,4,5,6,1};
        boolean issorted=true;
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                issorted=false;
                break;
            }
        }
        if(issorted){
            System.out.println("it is sorted");
        }else{
            System.out.println("it is not sorted");
        }
    }
}