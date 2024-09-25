class maze {
    public static void main(String args[])

    {
        boolean board[][] = { { true, true, true }, { true, true, true }, { true, true, true } };
        func("", board, 0, 0);
    }

    static void func(String p, boolean[][] board, int r, int c) {
        if (r == board.length - 1 && c == board[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!board[r][c])
            return;
        board[r][c] = false;

        if (r < board.length - 1)
            func(p + 'D', board, r + 1, c);
        if (c < board[0].length - 1)
            func(p + 'R', board, r, c + 1);
        if (r > 0)
            func(p + 'U', board, r - 1, c);

        if (c > 0)
            func(p + 'L', board, r, c - 1);
        board[r][c] = true;
    }

}