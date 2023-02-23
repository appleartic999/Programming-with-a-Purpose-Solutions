public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        Character[][] arr = new Character[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    arr[i][i] = '*';
                } else {
                    arr[i][j] = '0';
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    for (int k = 0; k <= width && j + k < n; k++) {
                        arr[i][j + k] = '*';
                    }
                    for (int k = 0; k <= width && j - k >= 0; k++) {
                        arr[i][j - k] = '*';
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println("");
        }
    }
}
