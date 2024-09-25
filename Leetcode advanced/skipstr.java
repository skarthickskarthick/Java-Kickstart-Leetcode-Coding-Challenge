class skipstr {
    public static void main(String args[]) {
        String s = "karthick is the best";
        String str = rec(s);
        System.out.println(str);
    }

    static String rec(String s) {
        if (s.isEmpty())
            return "";
        if (s.startsWith("is")) {
            return rec(s.substring(2));
        } else
            return (s.charAt(0) + rec(s.substring(1)));
    }
}