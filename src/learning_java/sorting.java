package learning_java;

public class sorting {

    public static void printarr(int arr[]) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void bubblesort(int arr[]){
        for(int i=0;i< arr.length-1; i++){
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printarr(arr);
    }

    public static void main(String[] args) {
        int arr[]={3,7,1,9,5};
        bubblesort(arr);
    }
}
