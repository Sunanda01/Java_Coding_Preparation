import java.util.*;
class ArrayOps{
    static boolean getLargest(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1])
                return false;
        }
        return true;
        
    }
}

class 1.1_IsSorted {
    public static void main(String[] args) {
        int arr[]={2, 1, 5, 3, 2};
        // int arr[]={2,5,7,8,9};
        System.out.println("Is Sorted => "+ArrayOps.getLargest(arr));        
    }
}

// Time Complexity: O(n), Space Complexity: O(1)