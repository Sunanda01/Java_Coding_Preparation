/*
 1
 2 2
 3 3 3
 4 4 4 4
 5 5 5 5 5
*/

import java.util.Scanner;
class Pattern{
    public static void printPattern(int n){   
        for (int i=1; i<=n; i++) {
            for (int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter pattern limit => ");
        var res=sc.nextInt();
        Pattern.printPattern(res);
    }
}

// Time Complexity: O(n^2)
// Space Complexity: O(1)