public class ActivationFunction {
    // Returns the Heaviside function of x.
    public static double heaviside(double x) {
        if (Double.isNaN(x)) {
            return Double.NaN;
        }
        if (x < 0.0) {
            return 0;
        } else if (x == 0.0) {
            return 0.5;
        }
        return 1.0;
    }

    // Returns the sigmoid function of x.
    public static double sigmoid(double x) {
        if (Double.isNaN(x)) {
            return Double.NaN;
        }
        if (x == Double.NEGATIVE_INFINITY) {
            return 0.0;
        }
        if (x == Double.POSITIVE_INFINITY) {
            return 1.0;
        }
        double value = 1 + Math.exp(-x);
        return (double) 1 / value;
    }

    // Returns the hyperbolic tangent of x.
    public static double tanh(double x) {
        if (Double.isNaN(x)) {
            return Double.NaN;
        }
        if (x <= -20) {
            return -1.0;
        }
        if (x >= 20) {
            return 1.0;
        }
        double numerator = Math.exp(x) - Math.exp(-x);
        double denominator = Math.exp(x) + Math.exp(-x);
        return numerator / denominator;
    }

    // Returns the softsign function of x.
    public static double softsign(double x) {
        if (Double.isNaN(x)) {
            return Double.NaN;
        }
        if (x == Double.NEGATIVE_INFINITY) {
            return -1.0;
        }
        if (x == Double.POSITIVE_INFINITY) {
            return 1.0;
        }
        return x / (1 + Math.abs(x));
    }

    // Returns the square nonlinearity function of x.
    public static double sqnl(double x) {
        if (Double.isNaN(x)) {
            return Double.NaN;
        }
        if (x == Double.NEGATIVE_INFINITY) {
            return -1.0;
        }
        if (x == Double.POSITIVE_INFINITY) {
            return 1.0;
        }
        if (x <= -2) {
            return -1;
        } else if (-2 < x && x < 0) {
            return x + ((x * x) / 4);
        } else if (0 <= x && x < 2) {
            return x - ((x * x) / 4);
        }
        return 1.0;
    }

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        System.out.println("heaviside(" + x + ") = " + heaviside(x));
        System.out.println("sigmoid(" + x + ") = " + sigmoid(x));
        System.out.println("tanh(" + x + ") = " + tanh(x));
        System.out.println("softsign(" + x + ") = " + softsign(x));
        System.out.println("sqnl(" + x + ") = " + sqnl(x));
    }
}
