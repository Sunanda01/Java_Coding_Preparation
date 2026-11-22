    class Sort{
        static void insertionSort(int arr[], int n){
            for(int i=1;i<n;i++){   
                System.out.println("\nAfter i= "+i+" iteration");
                for(int i1=0;i1<n;i1++)
                    System.out.print(arr[i1]+" ");
                
                int key=arr[i];
                int j=i-1;
                while(j>=0 && arr[j]>key){
                    arr[j+1]=arr[j];
                    System.out.println("\nAfter j= "+j+" iteration");
                    for(int i1=0;i1<n;i1++)
                        System.out.print(arr[i1]+" ");
                    j--;
                }
                arr[j+1]=key;   
                System.out.println("\nFinal => ");
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
            Sort.insertionSort(arr1,len);
            System.out.println("\nAfter Sorting");
            for(int i=0;i<len;i++)
                System.out.print(arr1[i]+" ");
            
        }
    }

// Time Complexity: O(n^2), Space Complexity: O(1)