class Sort{
    static void quickSort(int arr[], int l, int h){
        if(l<h){
            int p=partition(arr,l,h);
            quickSort(arr,l,p-1);
            quickSort(arr,p+1,h);
        }
    }
    static int partition(int arr[], int l, int h){
        int pivot=arr[h];
        int i=l-1;
        for(int j=l;j<=h-1;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=temp;
        return i+1;
    }
}

class Main {
    public static void main(String[] args) {
        int arr1[]={8,6,2,3,5};
        int arr2[]={2,6,2,2,2};
        int arr3[]={2,4,6,8,10};
        int len=arr1.length;
        Sort.quickSort(arr1,0,len-1);
        System.out.println("\nAfter Sorting");
        for(int i=0;i<len;i++)
            System.out.print(arr1[i]+" ");
    }
}