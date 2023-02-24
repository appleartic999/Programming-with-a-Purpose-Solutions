public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        long sumOfSteps = 0;
        for (int i = 0; i < trials; i++) {
            long manhattenDistance = -1;
//            Starting co-ordinte points
            long x = 0;
            long y = 0;
            long cnt = 0;
            while (manhattenDistance != r) {
                int randomDirection = (int) (Math.random() * 4);
                if (randomDirection == 0) {
                    x++;
                } else if (randomDirection == 1) {
                    y++;
                } else if (randomDirection == 2) {
                    x--;
                } else {
                    y--;
                }
                cnt++;
                manhattenDistance = Math.abs(x) + Math.abs(y);
            }
            sumOfSteps += cnt;
        }
        System.out.println("average number of steps = " + (double) (sumOfSteps) / trials);
    }
}
