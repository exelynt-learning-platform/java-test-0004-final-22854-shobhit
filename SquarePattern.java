public class SquarePattern {
    private static final int MAX_VAL = 4;

    public static void main(String[] args) {
        int size = 2 * MAX_VAL - 1;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                int top = i;
                int left = j;
                int bottom = size - i + 1;
                int right = size - j + 1;

                int minDistance = Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print((MAX_VAL - minDistance + 1) + " ");
            }
            System.out.println();
        }
    }
}
