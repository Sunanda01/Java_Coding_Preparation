/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/

import java.util.Scanner;
class Pattern{
    public static void printPattern(int n){  
        for (int i=1; i<=n; i++) {
            // spaces
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // stars
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }

            // next line
            System.out.println();
        }
        for (int i=n-1;i>=1;i--) {
            // spaces
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // stars
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }

            // next line
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