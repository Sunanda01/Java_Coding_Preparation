import java.util.*;
class ArrayOps{
    static int removeDuplicate(int arr[]){
        int j=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[j-1]){
                arr[j]=arr[i];
                j++;
            }
        }
        return j;
    }
    static void printArray(int arr[]){
        int len=arr.length;
        for(int i=0;i<len;i++)
            System.out.print(arr[i]+"\t");
    }
}

class 1.4_Remove_Duplicate {
    public static void main(String[] args) {
        int arr[]={5,10,10,10,20,30,40,40,50};
        System.out.println("Orinial Array => ");   
        ArrayOps.printArray(arr);
        int index=ArrayOps.removeDuplicate(arr);
        System.out.println("\n Index => "+index+"\nAfter removing duplicates from Array => ");     
        
        for(int i=0;i<index;i++)
            System.out.print(arr[i]+"\t");
    }
}

// Time Complexity: O(n), Space Complexity: O(1)