class Search{
    static int ternarySearch(int arr[],int n, int x){
        int left=0;
        int right=n-1;
        while(left<=right){
            int mid1=left+((right-left)/3);
            int mid2=right-((right-left)/3);
            if(arr[mid1]==x) return mid1;
            else if(arr[mid2]==x) return mid2;
            else if(arr[mid1]>x)
                right=mid1-1;
            else if(arr[mid2]<x)
                left=mid2+1;
            else{
                 left=mid1+1;
                 right=mid2-1;
            }        
        }
        return -1;
    }
    
}

class 4.3_TernarySearch {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
        int len=arr.length;
        // int index=Search.ternarySearch(arr, len, 40);
        // int index=Search.ternarySearch(arr, len, 20);
        int index=Search.ternarySearch(arr, len, 70);
        // int index=Search.ternarySearch(arr, len, 100);
        System.out.println("Found @ index "+index);
    }
}

// Time Complexity: O(log3 n), Space Complexity: O(1)