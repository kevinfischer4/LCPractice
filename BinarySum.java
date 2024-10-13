public class BinarySum {

    public int getSum(int a, int b) {
        return add(a, b);
    }

    private int add(int a, int b) {
        if (a == 0 || b == 0) {
            return a | b;
        }
        return add(a ^ b, (a & b) << 1);
    }
}
