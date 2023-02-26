public class WorldMap {
    public static void main(String[] args) {
        int n = StdIn.readInt();
        int m = StdIn.readInt();
        StdDraw.setCanvasSize(n, m);
        StdDraw.setXscale(0.0, n);
        StdDraw.setYscale(0.0, m);
        while (!StdIn.isEmpty()) {
            String regionName = StdIn.readString();
            int vertices = StdIn.readInt();
            double[] x = new double[vertices];
            double[] y = new double[vertices];
            for (int i = 0; i < vertices; i++) {
                double xi = StdIn.readDouble();
                double yi = StdIn.readDouble();
                x[i] = xi;
                y[i] = yi;
            }
            StdDraw.polygon(x, y);
        }
    }
}
