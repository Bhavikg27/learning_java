package learning_java;

public class sorting {

    public static void printarr(int arr[]) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    //time complexity = 0(n^2)
    public static void bubblesort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printarr(arr);
    }

    //time complexity = 0(n^2)
    public static void selectionsort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printarr(arr);
    }

    public static void insertionsort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]){
                arr[j+1]=arr[j];
                j--;
            }

            //placement
            arr[j+1] = current;
        }
        printarr(arr);
    }


    public static void main(String[] args) {
        int arr[] = {3, 7, 1, 9, 5};
        bubblesort(arr);
        selectionsort(arr);
        insertionsort(arr);
    }
}
