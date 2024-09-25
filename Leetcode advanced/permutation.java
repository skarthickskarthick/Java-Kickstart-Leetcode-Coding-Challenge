
class permutation {
    public static void main(String args[]) {
        rec("", "kar");
    }

    static void rec(String p, String s) {
        if (s.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = s.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String se = p.substring(i, p.length());
            rec(f + ch + se, s.substring(1));
        }

    }
}