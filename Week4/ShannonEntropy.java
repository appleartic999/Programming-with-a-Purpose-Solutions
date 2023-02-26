public class ShannonEntropy {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] freq = new int[m + 1];
        double[] p = new double[m + 1];
        freq[0] = 0;
        while (!StdIn.isEmpty()) {
            int x = StdIn.readInt();
            freq[x]++;
        }
        int sumOfFreq = 0;
        for (int num : freq) {
            sumOfFreq += num;
        }
        for (int i = 1; i <= m; i++) {
            p[i] = (double) freq[i] / sumOfFreq;
        }
        double ans = 0.0;
        for (int i = 1; i <= m; i++) {
            if (p[i] != 0)
                ans += (p[i] * (Math.log(p[i]) / Math.log(2)));
        }
        ans = ans * ((double) -1);
        StdOut.print(String.format("%.4f", ans));
    }
}
