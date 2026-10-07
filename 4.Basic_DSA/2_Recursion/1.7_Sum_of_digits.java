class Calc{
    static int sum(int n) {
        if(n<=0)
            return 0;
        return sum(n/10)+(n%10);
    }
}

class 1.7_Sum_of_digits {
     public static void main(String[] args) {
        System.out.println(Calc.sum(212001));
    }
}