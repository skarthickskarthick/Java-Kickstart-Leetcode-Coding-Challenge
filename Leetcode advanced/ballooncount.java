class ballooncount {
    public static void main(String args[]) {
        String text = "nlaebolko";
        String bal = "balloon";
        int ind = 0, count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == bal.charAt(ind)) {
                i = 0;
                ind++;
                text.replace(String.valueOf(text.charAt(i)), "");
                if (bal.charAt(ind) == 'n') {
                    count++;
                    ind = 0;
                }
            }

        }
        System.out.println(count);
    }
}