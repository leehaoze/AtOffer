import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class 斐波那契数列 {
    public static int Fibonacci(int n) {
        int[] data = new int[n + 1];
        if(n == 0 || n == 1){
            return n;
        }
        data[0] = 0;
        data[1] = 1;
        data[2] = 1;
        for (int i = 3; i <= n; ++i) {
            data[i] = data[i - 1] + data[i - 2];
        }

        return data[n];
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(0));
        System.out.println(Fibonacci(1));
        System.out.println(Fibonacci(2));
        System.out.println(Fibonacci(10));
        System.out.println(Fibonacci(39));
        System.out.println(Fibonacci(5));
    }
}
