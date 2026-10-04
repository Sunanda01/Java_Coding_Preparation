import java.util.*;
class ArrayOps{
    static int[] leftRotateByOne(int arr[]){
        int n=arr.length;
        int temp=arr[0];
        for(int i=1;i<n;i++)
            arr[i-1]=arr[i];
        arr[n-1]=temp;
        return arr;
    }
    static void printArray(int arr[]){
        int len=arr.length;
        for(int i=0;i<len;i++)
            System.out.print(arr[i]+"\t");
    }
}

class 1.5_Left_Rotate_By_One {
    public static void main(String[] args) {
        int arr[]={2,9,8,4,5,1};
        System.out.println("Orinial Array => ");   
        ArrayOps.printArray(arr);
        System.out.println("\n After left rotating array by 1 => ");     
        ArrayOps.leftRotateByOne(arr);
        ArrayOps.printArray(arr);
        
    }
}

// Time Complexity: O(n), Space Complexity: O(1)