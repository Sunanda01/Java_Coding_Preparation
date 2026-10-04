import java.util.*;
class ArrayOps{
    static int getSecondLargest(int arr[]){
        int res=-1;
        int largest=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[largest]){
                res=largest;
                largest=i;
            }
            else if(arr[i]!=arr[largest]){
                if(res == -1 || arr[i]>arr[res])
                    res=i;
            }
        }
        return res;
        
    }
}

class 1.2_Second_Largest_Index {
    public static void main(String[] args) {
        int arr[]={2, 1, 5, 3, 2};
        System.out.println("2nd Largest Index => "+ArrayOps.getSecondLargest(arr));        
    }
}
// Time Complexity: O(n), Space Complexity: O(1)