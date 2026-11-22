class Sort{
    static void bubbleSort(int arr[], int n){
        boolean swapped=false;
        for(int i=0;i<n-1;i++){
            System.out.println("\nAfter i= "+i+" iteration");
            for(int i1=0;i1<n;i1++)
                System.out.print(arr[i1]+" ");
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
                System.out.println("\nAfter j= "+j+" iteration");
                for(int i1=0;i1<n;i1++)
                    System.out.print(arr[i1]+" ");
            }    
            System.out.println();
            if(swapped==false)
                break;
        }
    }
}

class 5.1_BubbleSort {
    public static void main(String[] args) {
        int arr1[]={8,6,2,3,5};
        int arr2[]={2,6,2,2,2};
        int arr3[]={2,4,6,8,10};
        int len=arr1.length;
        Sort.bubbleSort(arr1,len);
        System.out.println("\nAfter Sorting");
        for(int i=0;i<len;i++)
            System.out.print(arr1[i]+" ");
        
    }
}

// Time Complexity: O(n^2), Space Complexity: O(1)
