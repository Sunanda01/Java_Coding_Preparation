import java.util.*;
class ArrayOps{
    static int[] getReverseArray(int arr[]){
        int low=0;
        int high=arr.length-1;
        int temp;
        while(low<high){
            temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        return arr;
    }
    static void printArray(int arr[]){
        int len=arr.length;
        for(int i=0;i<len;i++)
            System.out.print(arr[i]+"\t");
    }
}

class 1.3_Reverse_Array {
    public static void main(String[] args) {
        int arr[]={2, 1, 5, 3, 2};
        // int arr[]={2,5,7,8,9};
        System.out.println("Orinial Array => ");   
        ArrayOps.printArray(arr);
        System.out.println("\nReversed Array => ");     
        ArrayOps.getReverseArray(arr);
        ArrayOps.printArray(arr);
    }
}

// Time Complexity: O(n), Space Complexity: O(1)