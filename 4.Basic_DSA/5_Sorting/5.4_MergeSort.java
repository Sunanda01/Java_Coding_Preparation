    class Sort{
        static void mergeSort(int arr[], int l, int r){
            if(r>l){
                int m=l+(r-l)/2;
                mergeSort(arr,l,m);
                mergeSort(arr,m+1,r);
                merge(arr,l,m,r);
            }
        }
        static void merge(int arr[], int l, int m, int h){
            int n1=m-l+1;
            int n2=h-m;
            int[] left=new int[n1];
            int[] right=new int[n2];
            for(int i=0;i<n1;i++)
                left[i]=arr[l+i];
            for(int i=0;i<n2;i++)
                right[i]=arr[m+i+1];

            int i=0, j=0, k=l;
            while(i<n1 && j<n2){
                if(left[i]<=right[j]){
                    arr[k]=left[i];
                    i++;
                    k++;
                }
                else{
                    arr[k]=right[j];
                    j++;
                    k++;
                }
            }
            while(i<n1){
                arr[k]=left[i];
                k++;
                i++;
            }
            while(j<n2){
                arr[k]=right[j];
                k++;
                j++;
            }
        }
    }
    
    class Main {
        public static void main(String[] args) {
            int arr1[]={8,6,2,3,5};
            int arr2[]={2,6,2,2,2};
            int arr3[]={2,4,6,8,10};
            int len=arr1.length;
            Sort.mergeSort(arr1,0,len-1);
            System.out.println("\nAfter Sorting");
            for(int i=0;i<len;i++)
                System.out.print(arr1[i]+" ");
            
        }
    }

// Time Complexity: O(nlogn), Space Complexity: O(n)