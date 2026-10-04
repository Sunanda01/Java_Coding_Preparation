import java.util.*;
class ArrayOps{
    static int getLargest(int arr[]){
        int res=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[res])
                res = i;
        }
        return res;
        
    }
}

class 1.0_Largest_Index {
    public static void main(String[] args) {
        int arr[]={2, 1, 5, 3, 2};
        System.out.println(ArrayOps.getLargest(arr));        
    }
}

//Time Complexity: O(n), Space Complexity: O(1)