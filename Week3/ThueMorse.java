public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] ans = new int[n];
        ans[0] = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                ans[i] = 1 - ans[i - 1];
            } else {
                ans[i] = ans[i / 2];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (ans[i] == ans[j]) {
                    System.out.print("+  ");
                } else {
                    System.out.print("-  ");
                }
            }
            System.out.println("");
        }
    }
}
