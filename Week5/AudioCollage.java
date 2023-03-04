public class AudioCollage {
    // Returns a new array that rescales a[] by a multiplicative factor of alpha.
    public static double[] amplify(double[] a, double alpha) {
        double[] ans = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            ans[i] = a[i] * alpha;
        }
        return ans;
    }

    // Returns a new array that is the reverse of a[].
    public static double[] reverse(double[] a) {
        double[] ans = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            ans[a.length - i - 1] = a[i];
        }
        return ans;
    }

    // Returns a new array that is the concatenation of a[] and b[].
    public static double[] merge(double[] a, double[] b) {
        double[] ans = new double[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            ans[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            ans[i + a.length] = b[i];
        }
        return ans;
    }

    // Returns a new array that is the sum of a[] and b[],
    // padding the shorter arrays with trailing 0s if necessary.
    public static double[] mix(double[] a, double[] b) {
        if (a.length == b.length) {
            double[] c = new double[a.length];
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i] + b[i];
            }
            return c;
        } else if (a.length < b.length) {
            double[] c = new double[b.length];
            double[] d = new double[b.length];
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i];
            }
            for (int i = 0; i < b.length; i++) {
                d[i] = c[i] + b[i];
            }
            return d;
        } else {
            double[] c = new double[a.length];
            double[] d = new double[a.length];
            for (int i = 0; i < b.length; i++) {
                c[i] = b[i];
            }
            for (int i = 0; i < a.length; i++) {
                d[i] = a[i] + c[i];
            }
            return d;
        }
    }

    // Returns a new array that changes the speed by the given factor.
    public static double[] changeSpeed(double[] a, double alpha) {
        double samples = (a.length / alpha);
        int x = (int) samples;
        double[] ans = new double[x];
        for (int i = 0; i < x; i++) {
            ans[i] = a[(int) (i * alpha)];
        }
        return ans;
    }

    // Creates an audio collage and plays it on standard audio.
    // See below for the requirements.
    public static void main(String[] args) {
        double[] audio1 = StdAudio.read("cow.wav");
        double[] audio2 = StdAudio.read("silence.wav");
        double[] audio3 = StdAudio.read("piano.wav");
        double[] audio4 = StdAudio.read("harp.wav");
        double[] audio5 = StdAudio.read("chimes.wav");
        double[] e1 = amplify(audio1, 0.5);
        double[] e2 = reverse(audio3);
        double[] e3 = merge(e1, audio4);
        double[] e4 = changeSpeed(audio5, 1.2);
        double[] e5 = mix(e2, e4);
        double[] e6 = merge(e3, e5);
        double[] e7 = merge(e6, audio2);
        StdAudio.play(e7);
    }
}
