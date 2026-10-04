import java.util.*;
class ArrayOps{
    // 1. Search for a number
    static boolean search(int arr[], int num){
        for(int i=0;i<arr.length;i++)
            if(arr[i]==num)
                return true;
        return false;
    }
    // Time Complexity: O(n), Space Complexity: O(1)

    // 2. Insert in an array
    static int insert(int arr[],int len, int pos, int capacity, int num){
        if(len==capacity)  
            return len;
        int index=pos-1;
        for(int i=len-1;i>=index;i--){
            arr[i+1]=arr[i];
        }
        arr[index]=num;
        return len+1;     
    }
    // Time Complexity: O(n), Space Complexity: O(1)

    // 3. Delete element from array
    static int delete(int arr[],int len, int num){
        int i;
        for(i=0;i<len;i++)
            if(arr[i]==num)
                break;
        if(i==len)
            return len;
        for(int j=i;j<len-1;j++)
            arr[j]=arr[j+1];
        return len-1;       
    } 
    // Time Complexity: O(n), Space Complexity: O(1)
        
    //4. Print Array    
    static void printArray(int arr[],int len){
        for(int i=0;i<len;i++)
            System.out.print(arr[i]+"\t");
        System.out.println();
    }
    // Time Complexity: O(n), Space Complexity: O(1)
}

class 1_Array_Operations {
    public static void main(String[] args) {
        int capacity=10;
        int[] arr=new int[capacity];
        arr[0]=4;
        arr[1]=8;
        arr[2]=2;
        arr[3]=7;
        arr[4]=9;
        System.out.println(ArrayOps.search(arr,15));
        
        int number=15;
        int pos=2;
        int res=ArrayOps.insert(arr,5,pos,capacity,number);
        ArrayOps.printArray(arr,res);
        
        int res1=ArrayOps.delete(arr,6,number);
        ArrayOps.printArray(arr,res1);        
    }
}