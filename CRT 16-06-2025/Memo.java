import java.util.Arrays;
public class Main {
  // Recursive Fibonacci with Memoization
    public static long fibMemoization(long n, long[] memo) {
        if (n == 0 || n == 1)
            return n;
       if (memo[(int) n] != 0)
            return memo[(int) n];

        long val = fibMemoization(n - 1, memo) + fibMemoization(n - 2, memo);
        memo[(int) n] = val;
        return val;
    }
    // Iterative Fibonacci using Tabulation
    public static long fibTabulation(int n, long[] memo) {
        if (n >= memo.length) {
            System.out.println("Insufficient memory in memo (length: " + memo.length + ")");
            return -1;
        }
        memo[0] = 0;
        if (n > 0) memo[1] = 1;

        for (int i = 2; i <= n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[n];
    }

    public static void main(String[] args) {
        // Memoization
        long[] memo = new long[100];
        System.out.println("Memoization Results:");
        System.out.println("Fib(30): " + fibMemoization(30, memo));
        System.out.println("Fib(50): " + fibMemoization(50, memo));
        System.out.println("Fib(70): " + fibMemoization(70, memo));
        System.out.println("Memo Array: " + Arrays.toString(Arrays.copyOf(memo, 71)));

        // Tabulation
        long[] tabMemo = new long[21];
        System.out.println("\nTabulation Result:");
        System.out.println("Fib(20): " + fibTabulation(20, tabMemo));
        System.out.println("Tabulated Memo: " + Arrays.toString(tabMemo));
    }
}
