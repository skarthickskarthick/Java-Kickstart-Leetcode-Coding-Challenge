class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0)

            return new ArrayList<String>();

        return func("", digits);
    }

    static ArrayList<String> func(String p, String s) {
        if (s.length() == 0) {
            ArrayList<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }
        String[] keypad = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        String key = keypad[s.charAt(0) - 48];
        ArrayList<String> l = new ArrayList<>();

        for (int i = 0; i < key.length(); i++) {

            l.addAll(func(p + key.charAt(i), s.substring(1)));

        }
        return l;
    }
}