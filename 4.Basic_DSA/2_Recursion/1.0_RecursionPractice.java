class RecursionPractice {
    static void fun(int n){
        if (n==0)
            return;
        System.out.println(n);
        fun(n-1);
        System.out.println(n);
    }
    // Time Complexity: O(2^n), Space Complexity: O(n)

    static void fun1(int n){
        if (n==0)
            return;
        fun1(n-1);
        System.out.println(n);
        fun1(n-1);
    }
    // Time Complexity: O(2^n), Space Complexity: O(n)
    
    static int fun2(int n){
        if (n==1)
            return 0;
        else
            return 1+fun2(n/2);              //log2 n
        // return 1+fun2(n/3);               //log3 n
    }
    // Time Complexity: O(log n), Space Complexity: O(log n)
    
    static void fun3(int n){
        if (n==0)
            return;
       fun3(n/2);
       System.out.print(n%2+"\t");
    }
    // Time Complexity: O(log n), Space Complexity: O(log n)

class 1.0_RecursionPractice {
    public static void main(String[] args) {
        RecursionPractice.fun(3);
        System.out.println();
        RecursionPractice.fun1(3);
        System.out.println();
        System.out.println(RecursionPractice.fun2(18));
        System.out.println();
        RecursionPractice.fun3(8);
    }
}