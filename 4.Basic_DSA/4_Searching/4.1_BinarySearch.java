class Search{
    static int binarySeach(int arr[], int n, int x){
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x)
                return mid;
            else if(arr[mid]>x)
                high=mid-1;
            else
                low=mid+1;
        }
        return -1;
    }
}

class 4.1_BinarySearch {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
        int len=arr.length;
        // int index=Search.binarySeach(arr, len, 40);
        // int index=Search.binarySeach(arr, len, 20);
        int index=Search.binarySeach(arr, len, 70);
        // int index=Search.binarySeach(arr, len, 100);
        System.out.println("Found @ index "+index);
    }
}

// Time Complexity: O(log n), Space Complexity: O(1)