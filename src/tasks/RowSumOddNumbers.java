package tasks;

public class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
        if (n == 1) {
            return 1;
        } else {
            int arithmeticSum = ((2 * 2 + (n - 1 - 1) * 2) / 2) * (n - 1);
            return ((arithmeticSum + 1) * n) + arithmeticSum;
        }
    }
}