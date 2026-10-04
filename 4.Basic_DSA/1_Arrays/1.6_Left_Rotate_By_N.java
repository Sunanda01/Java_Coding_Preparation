import java.util.*;
class ArrayOps{
    static int[] leftRotateByN(int arr[],int d){
        int n=arr.length;
        int[] temp=new int[n];
        for(int i=0;i<d;i++)
            temp[i]=arr[i];
        for(int i=d;i<n;i++)
            arr[i-d]=arr[i];
        for(int i=0;i<d;i++)
            arr[n-d+i]=temp[i];
        return arr;
    }
    static void printArray(int arr[]){
        int len=arr.length;
        for(int i=0;i<len;i++)
            System.out.print(arr[i]+"\t");
    }
}

class 1.6_Left_Rotate_By_N {
    public static void main(String[] args) {
        int arr[]={2,9,8,4,5,1};
        System.out.println("Orinial Array => ");   
        ArrayOps.printArray(arr);
        int n=2;
        System.out.println("\n After left rotating array by "+n+" => ");     
        ArrayOps.leftRotateByN(arr,n);
        ArrayOps.printArray(arr);
        
    }
}

// Time Complexity: O(n), Space Complexity: O(n)