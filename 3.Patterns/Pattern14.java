/*
A 
B B 
C C C 
D D D D 
E E E E E
*/

import java.util.Scanner;
class Pattern{
    public static void printPattern(int n){  
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char) (64+i)+" ");
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