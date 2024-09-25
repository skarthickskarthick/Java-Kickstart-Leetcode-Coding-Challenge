class subsequences {
    public static void main(String args[]) {
        rec("", "kar");
    }

    static void rec(String p, String s) {
        if (s.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = s.charAt(0);
        rec(p + ch, s.substring(1));
        rec(p, s.substring(1));
    }
}