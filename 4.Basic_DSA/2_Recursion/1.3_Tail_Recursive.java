class Fact{
    static int factorial(int n, int result) {
    if (n == 0)
        return result;
    
    return factorial(n - 1, result * n);
    }
}

class 1.3_Tail_Recursive {
    public static void main(String[] args) {
        System.out.println(Fact.factorial(5, 1));
    }
}

// Tail Recursive function is a recursive function where the recursive call is the last operation performed by the function.

// Main advantage of tail recursion is potential optimization by the compiler/runtime

// Why can it be faster?
// In languages that support Tail Call Optimization (TCO), the runtime can reuse the current stack frame instead of creating a new one