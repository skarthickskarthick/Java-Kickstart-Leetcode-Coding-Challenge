class diceroll {
    public static void main(String args[]) {
        func("", 4);
    }

    static void func(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 & i <= target; i++)
            func(p + i, target - i);
    }
}