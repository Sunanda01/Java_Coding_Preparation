class RopeCutting {
    static void subset(String s, String cur, int i) {
        if (s.length() == i) {
            System.out.println(cur);
            return;
        }
        // Don't include current character
        subset(s, cur, i + 1);

        // Include current character
        subset(s, cur + s.charAt(i), i + 1);
    }
}

class 1.9_Subsets {
    public static void main(String[] args) {
        String s = "ABC";
        String cur = "";
        int i = 0;
        RopeCutting.subset(s, cur, i);
    }
}

// Time Complexity: O(2^n) - The function makes two recursive calls for each character in the string, leading to an exponential time complexity.
// Space Complexity: O(n) - The maximum depth of the recursion tree can go up to