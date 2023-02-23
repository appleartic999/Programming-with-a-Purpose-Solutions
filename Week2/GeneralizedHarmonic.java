public class GeneralizedHarmonic {
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        long r = Long.parseLong(args[1]);
        double ans = 1.0;
        for (int i = 2; i <= n; i++) {
            ans += 1.0 / Math.pow(i, r);
        }
        System.out.println(ans);
    }
}
