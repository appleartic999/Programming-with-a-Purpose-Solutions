public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int cnt = 0;
        int manhattanDistance = -1;
//        Starting Co-ordinates
        int x = 0;
        int y = 0;
        while (manhattanDistance != r) {
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
            System.out.println("(" + x + " " + y + ")");
            cnt++;
            manhattanDistance = Math.abs(x) + Math.abs(y);
        }
        System.out.println("steps = " + cnt);
    }
}
