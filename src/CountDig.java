public class CountDig {
    public static int nbDig(int n, int d) {
        int counting = 0;
        String number;
        char digit = Character.forDigit(d, 10);
        for (int i = 0; i < n + 1; i++) {
            number = String.valueOf(i * i);
            for (int j = 0; j < number.length(); j++) {
                if (number.charAt(j) == digit) {
                    counting++;
                }
            }
        }
        return counting;
    }
}