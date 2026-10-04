import java.util.*;
class ArrayOps{
    static int[] shiftZeros(int arr[]){
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int temp;
            if(arr[i]!=0){
                temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;                    
            }
        }
        return arr;
    }
    static void printArray(int arr[]){
        int len=arr.length;
        for(int i=0;i<len;i++)
            System.out.print(arr[i]+"\t");
    }
}

class 1.7_Shift_Zeros {
    public static void main(String[] args) {
        int arr[]={2,0,0,4,0,1};
        System.out.println("Orinial Array => ");   
        ArrayOps.printArray(arr);
        System.out.println("\n After shifting zeros to the end of array => ");     
        ArrayOps.shiftZeros(arr);
        ArrayOps.printArray(arr);
        
    }
}

// Time Complexity: O(n), Space Complexity: O(1)