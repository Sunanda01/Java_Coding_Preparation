class Sort{
    static void selectionSort(int arr[], int n){
        for(int i=0;i<n-1;i++){         
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[min_index]>arr[j])
                    min_index=j;
            }    
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;

            System.out.println("After i= "+i+" iteration");
            for(int i1=0;i1<n;i1++)
                System.out.print(arr[i1]+" ");
            System.out.println();
        }
    }
}

class Main {
    public static void main(String[] args) {
        int arr1[]={8,6,2,3,5};
        int arr2[]={2,6,2,2,2};
        int arr3[]={2,4,6,8,10};
        int len=arr1.length;
        Sort.selectionSort(arr1,len);
        System.out.println("\nAfter Sorting");
        for(int i=0;i<len;i++)
            System.out.print(arr1[i]+" ");
        
    }
}

// Time Complexity: O(n^2), Space Complexity: O(1)