public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);
        int[][] grid = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = 0;
            }
        }
        int z = k;

        while (z > 0) {
            int x = (int) (Math.random() * m);
            int y = (int) (Math.random() * n);
            if (grid[x][y] != -1) {
                grid[x][y] = -1;
                z--;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == -1) {
                    if (i + 1 < m && grid[i + 1][j] != -1) grid[i + 1][j] += 1;
                    if (i - 1 >= 0 && grid[i - 1][j] != -1) grid[i - 1][j] += 1;
                    if (j + 1 < n && grid[i][j + 1] != -1) grid[i][j + 1] += 1;
                    if (j - 1 >= 0 && grid[i][j - 1] != -1) grid[i][j - 1] += 1;
                    if (i + 1 < m && j + 1 < n && grid[i + 1][j + 1] != -1) grid[i + 1][j + 1] += 1;
                    if (i - 1 >= 0 && j + 1 < n && grid[i - 1][j + 1] != -1) grid[i - 1][j + 1] += 1;
                    if (i + 1 < m && j - 1 >= 0 && grid[i + 1][j - 1] != -1) grid[i + 1][j - 1] += 1;
                    if (i - 1 >= 0 && j - 1 >= 0 && grid[i - 1][j - 1] != -1) grid[i - 1][j - 1] += 1;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == -1) System.out.print("*  ");
                else {
                    System.out.print(grid[i][j] + "  ");
                }
            }
            System.out.println("");
        }
    }
}
