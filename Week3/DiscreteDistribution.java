public class DiscreteDistribution {
    public static void main(String[] args) {
        int[] arr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        int[] sumArr = new int[args.length];
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sumArr[i] = sum;
            sum += arr[i];
        }
        int m = Integer.parseInt(args[0]);
        for (int i = 0; i < m; i++) {
            int randomNum = (int) (Math.random() * (sum - 1));
            for (int j = 0; j < sumArr.length - 1; j++) {
                if (sumArr[j] <= randomNum && sumArr[j + 1] < randomNum) {
                    System.out.print(j + 1 + " ");
                }
            }
        }
        System.out.println("");
    }
}
