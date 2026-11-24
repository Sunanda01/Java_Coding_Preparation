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
    public static void intersection(int arr1[],int m, int arr2[], int n){
        int i=0,j=0;
        while(i<m && j<n){
            if(i>0 && arr1[i]==arr1[i-1]){
                i++;
                continue;
            }
            if(arr1[i]<arr2[j])
                i++;
            else if(arr1[i]>arr2[j])
                j++;
            else{
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
        }
    }
    
   
}

class Main {
    public static void main(String[] args) {
        int arr1[]={10,20,20,40,60};
        int arr2[]={2,20,20,20};
        int m=arr1.length;
        int n=arr2.length;
        Sort.bubbleSort(arr1,m);
        Sort.bubbleSort(arr2,n);
        System.out.print("Array A = ");
        for(int i=0;i<m;i++)
            System.out.print(arr1[i]+" ");
        System.out.print("\nArray B = ");
        for(int i=0;i<n;i++)
            System.out.print(arr2[i]+" ");
        System.out.println("\nIntersection of Array A and Array B ");
        Sort.intersection(arr1,m,arr2,n);
        
    }
}

// Time Complexity: O(n^2), Space Complexity: O(1)