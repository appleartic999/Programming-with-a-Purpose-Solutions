public class DiscreteDistribution {
    public static void main(String[] args) {
        int[] sumArr = new int[args.length + 1];
        int sum = 0;
        sumArr[0] = 0;
        for (int i = 1; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
            sumArr[i] = sum;
        }
        int m = Integer.parseInt(args[0]);
        sumArr[args.length] = sumArr[args.length - 1] + 1;
        for (int i = 0; i < m; i++) {
            double random = (Math.random() * sum);
            int randomNum = (int) random;
            for (int j = 0; j < args.length; j++) {
                if (sumArr[j] <= randomNum && randomNum < sumArr[j + 1]) {
                    System.out.print(j + 1 + " ");
                    break;
                }
            }
        }
        System.out.println("");
    }
}
