class RopeCutting{
    static int calc(int n, int a, int b, int c) {
        if(n==0)
            return 0;
        if(n<0)
            return -1;
        int res=Math.max(calc(n-a,a,b,c), Math.max(calc(n-b,a,b,c), calc(n-c,a,b,c)));
        if(res==-1)
            return -1;
        return res+1;
    }
}

class 1.8_Rope_Cutting {
     public static void main(String[] args) {
         int n = 23;
         int a = 11;
         int b = 9;
         int c = 12;
        System.out.println(RopeCutting.calc(n,a,b,c));
    }
}

// Time Complexity: O(3^n) - The function makes three recursive calls for each value of n, leading to an exponential time complexity.
// Space Complexity: O(n) - The maximum depth of the recursion tree can go up to n, leading to a linear space complexity due to the function call stack.