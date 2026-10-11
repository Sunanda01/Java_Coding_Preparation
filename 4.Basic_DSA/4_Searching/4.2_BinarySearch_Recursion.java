class Search{
    static int binarySearch(int arr[], int low, int high ,int x){
        if(low>high) return -1;
        int mid=(low+high)/2;
        if(arr[mid]==x)
            return mid;
        else if(arr[mid]>x)
            return binarySearch(arr,low,mid-1,x);
        else
            return binarySearch(arr,mid+1,high,x);
    }
}

class 4.2_BinarySearch_Recursion {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
        int len=arr.length;
        int low=0;
        int high=len-1;
        // int index=Search.binarySearch(arr, low, high, 40);
        // int index=Search.binarySearch(arr, low, high, 20);
        int index=Search.binarySearch(arr, low, high, 70);
        // int index=Search.binarySearch(arr, low, high, 100);
        System.out.println("Found @ index "+index);
    }
}

// Time Complexity: O(log n), Space Complexity: O(log n)