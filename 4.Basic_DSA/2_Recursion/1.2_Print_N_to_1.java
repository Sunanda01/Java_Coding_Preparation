class Test{
    static void fun(int n){
        if (n==0)
            return;
        fun(n-1);
        System.out.println(n);
    }
}

class 1.2_Print_N_to_1 {
    public static void main(String[] args) {
        Test.fun(5);
    }
}

// Time Complexity: O(n), Space Complexity: O(n)