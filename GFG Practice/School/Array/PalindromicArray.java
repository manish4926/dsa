class GfG {
    public static int palinArray(int[] a, int n) {
        // boolean testRes = true;
        for (int i = 0; i < n; i++) {
            String s = String.valueOf(a[i]);
            if (isPalindrome(s) == false) {
                return 0;
            }
            // System.out.println(s);
        }
        return 1;
    }

    public static boolean isPalindrome(String s) {
        int lo = 0;
        int hi = s.length() - 1;

        while (lo < hi) {
            if (s.charAt(lo) != s.charAt(hi)) {
                return false;
            }

            lo++;
            hi--;
        }
        return true;
    }
}