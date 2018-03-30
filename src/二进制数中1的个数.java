public class 二进制数中1的个数 {
    public static int NumberOf1(int n) {
        int count = 0;
        while (true) {
            if(n == 0) return count;
            n = (n - 1) & n;
            count++;
        }
    }

    public static void main(String[] args) {
        System.out.println(NumberOf1(1));
        System.out.println(NumberOf1(2));
        System.out.println(NumberOf1(3));
        System.out.println(NumberOf1(4));
        System.out.println(NumberOf1(5));
        System.out.println(NumberOf1(6));
    }
}
