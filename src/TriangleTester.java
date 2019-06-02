class TriangleTester {
    public static boolean isTriangle(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            return false;
        }
        if ((a > b) || (a > c)) {
            return a < (b + c);
        } else {
            if ((b > a) || (b > c)) {
                return b < (a + c);
            } else return c < (a + b);
        }
    }
}
