class Search{
    static int ternarySearch(int arr[],int left, int right, int x){
        if(left>right) return -1;
        int mid1=left+((right-left)/3);
        int mid2=right-((right-left)/3);
        if(arr[mid1]==x) return mid1;
        else if(arr[mid2]==x) return mid2;
        else if(arr[mid1]>x)
            return ternarySearch(arr,left,mid1-1,x);
        else if(arr[mid2]<x)
            return ternarySearch(arr,mid2+1,right,x);
         else
            return ternarySearch(arr,mid1+1,mid2-1,x);
    }
    
}

class 4.4_TernarySearch_Recursion {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
        int len=arr.length;
        int left=0;
        int right=len-1;
        // int index=Search.ternarySearch(arr, left, right, 40);
        // int index=Search.ternarySearch(arr, left, right, 20);
        int index=Search.ternarySearch(arr, left, right, 70);
        // int index=Search.ternarySearch(arr, left, right, 100);
        System.out.println("Found @ index "+index);
    }
}
// Time Complexity: O(log3 n), Space Complexity: O(log3 n)
