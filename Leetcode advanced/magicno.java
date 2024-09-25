class magicno {
    public static void main(String args[]) {
        int n = 3, base = 5, ans = 0;
        while (n > 0) {
            int digit = n & 1;
            n = n >> 1;
            ans += digit * base;
            base *= 5;
        }
        System.out.println(ans);
    }
}