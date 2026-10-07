class Calc{
    static int factorial(int n) {
    if (n == 0)
        return 1;
    return n * factorial(n - 1);
    }

    static int fibonacci(int n){
        if(n<=1)
            return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}

class 1.4_Base_Case_Recursion {
    public static void main(String[] args) {
        System.out.println(Calc.factorial(5));
        System.out.println(Calc.fibonacci(5));
    }
}

// Time Complexity: O(n), Space Complexity: O(n)