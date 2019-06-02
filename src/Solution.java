public class Solution {
    public static boolean validatePin(String pin) {
        boolean checkPin = false;
        if (pin.length() == 4 || pin.length() == 6) {
            for (int i = 0; i < pin.length(); i++) {
                if (pin.codePointAt(i) >= 48 && pin.codePointAt(i) <= 57) {
                    checkPin = true;
                } else {
                    checkPin = false;
                    break;
                }
            }
        } else {
            checkPin = false;
        }
        return checkPin;
    }
}

