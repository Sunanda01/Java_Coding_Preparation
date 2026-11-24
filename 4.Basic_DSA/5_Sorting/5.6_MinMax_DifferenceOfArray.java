class Sort{
    public static void bubbleSort(int arr[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static int minDifference(int arr[],int n){
        int res=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            res=Math.min(res,arr[i+1]-arr[i]);
        }
        return res;
    }
    public static int maxDifference(int arr[],int n){
        int res=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            res=Math.max(res,arr[i+1]-arr[i]);
        }
        return res;
    }
}

class Main {
    public static void main(String[] args) {
        int arr[]={5,3,7,2,1};
        int len=arr.length;
        Sort.bubbleSort(arr,len);
        for(int i=0;i<len;i++)
            System.out.print(arr[i]+"\t");
        int min_res=Sort.minDifference(arr,len);
        int max_res=Sort.maxDifference(arr,len);
        System.out.println("\nMinimum Difference is "+min_res+"\nMaximum Difference is "+max_res);
    }
}

// Time Complexity: O(n^2), Space Complexity: O(1)