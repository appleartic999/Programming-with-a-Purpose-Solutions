public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        long cnt = 0;
        long manhattanDistance = -1;
//        Starting Co-ordinates
        long x = 0;
        long y = 0;
        System.out.println("(" + x + ", " + y + ")");
        while (true) {
            manhattanDistance = Math.abs(x) + Math.abs(y);
            if (manhattanDistance == r) break;
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
            System.out.println("(" + x + ", " + y + ")");
            cnt++;
        }
        System.out.println("steps = " + cnt);
    }
}
