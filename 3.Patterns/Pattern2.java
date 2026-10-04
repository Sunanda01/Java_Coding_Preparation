/*
* * * * * 
* * * * 
* * * 
* * 
*
*/

import java.util.Scanner;
class Pattern{
    public static void printPattern(int n){     
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(" * ");
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