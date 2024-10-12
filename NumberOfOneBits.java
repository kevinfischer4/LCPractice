public class NumberOfOneBits {
    public int hammingWeight(int n) {
        int res = 0;
        while(n != 0){
            res += n % 2;
            n /= 2;

        }
        return res;
    }

    /*
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
     */

    public static void main(String[] args) {

    }
}
