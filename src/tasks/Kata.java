package tasks;

public class Kata {
    public static String getMiddle(String word) {
        int length = word.length();
        if (length % 2 == 0) {
            return "" + word.charAt((length - 1) / 2) + word.charAt(((length - 1) / 2) + 1);
        }
        return "" + word.charAt(length / 2);
    }
}