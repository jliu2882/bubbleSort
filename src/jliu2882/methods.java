package jliu2882;

public class methods {
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static int randInt(int max){
        return (int)(Math.random()*(max+1));
    }

    public static int[] randIntArr(int count){
        int[] arr;
        arr = new int[count];
        for(int i = 0; i < arr.length; i++){
            arr[i] = randInt(9);
        }
        return arr;
    }

    public static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-1; j++) {
                if (arr[j + 1] < arr[j]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i ++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i]>arr[j]){
                    swap(arr,i,j);
                }
            }
        }
    }

    public static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i ++){
            int temp = arr[i];
            int j;
            for(j = i-1; j>=0 && temp  < arr[j]; j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;
        }
    }
}