public class Divisors {
    // Returns the greatest common divisor of a and b.
    public static int gcd(int a, int b) {
        if (b == 0) return Math.abs(a);
        int x = Math.abs(a);
        int y = Math.abs(b);
        int temp = x;
        while (true) {
            temp = x;
            x = y;
            y = temp % y;
            if (y == 0) break;
        }
        return x;
    }

    // Returns the least common multiple of a and b.
    public static int lcm(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        int x = gcd(a, b);
        if (x == 0) return 0;
        if (a % x == 0) return (a / x) * b;
        return (b / x) * a;
    }

    // Returns true if a and b are relatively prime; false otherwise.
    public static boolean areRelativelyPrime(int a, int b) {
        if (gcd(a, b) == 1) return true;
        return false;
    }

    // Returns the number of integers between 1 and n that are
    // relatively prime with n.
    public static int totient(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (areRelativelyPrime(i, n)) cnt++;
        }
        return cnt;
    }

    // Takes two integer command-line arguments a and b and prints
    // each function, evaluated in the format (and order) given below.
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("gcd(" + a + ", " + b + ") = " + gcd(a, b));
        System.out.println("lcm(" + a + ", " + b + ") = " + lcm(a, b));
        System.out.println("areRelativelyPrime(" + a + ", " + b + ") = " + areRelativelyPrime(a, b));
        System.out.println("totient(" + a + ") = " + totient(a));
        System.out.println("totient(" + b + ") = " + totient(b));
    }
}