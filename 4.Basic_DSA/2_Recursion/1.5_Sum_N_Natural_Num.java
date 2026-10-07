class Calc{
    static int sum(int n) {
        if(n<=0)
            return 0;
        return n+sum(n-1);
    }
}

class 1.5_Sum_N_Natural_Num {
    public static void main(String[] args) {
        System.out.println(Calc.sum(5));
    }
}