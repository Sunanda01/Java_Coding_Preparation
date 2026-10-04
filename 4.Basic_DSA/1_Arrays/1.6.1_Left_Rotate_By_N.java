import java.util.*;
class ArrayOps{
    static void leftRotateByN(int arr[],int d){
        int n=arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    static void reverse(int arr[], int low, int high){
        // int[] temp=new int[arr.length];
        int temp;
        while(low<high){
            temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
    static void printArray(int arr[]){
        int len=arr.length;
        for(int i=0;i<len;i++)
            System.out.print(arr[i]+"\t");
    }
}

class 1.6.1_Left_Rotate_By_N {
    public static void main(String[] args) {
        int arr[]={2,9,8,4,5,1};
        System.out.println("Orinial Array => ");   
        ArrayOps.printArray(arr);
        int n=2;
        System.out.println("\nAfter left rotating array by "+n+" => ");     
        ArrayOps.leftRotateByN(arr,n);
        ArrayOps.printArray(arr);
        
    }
}

// Time Complexity: O(n), Space Complexity: O(1)