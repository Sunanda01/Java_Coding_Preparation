class Test{
    static void fun(int n){
        if (n==0)
            return;
        System.out.println(n);
        fun(n-1);
    }
}

class 1.1_Print_1_to_N {
    public static void main(String[] args) {
        Test.fun(5);
    }
}

// Time Complexity: O(n), Space Complexity: O(n)