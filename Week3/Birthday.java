public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        System.out.println(1 + " " + 0 + " " + 0.0);
        double avg = 0.0;
        int index = 1;
        int[] birthdayList = new int[n];
        long[] cntArr = new long[n + 2];
        for (int i = 0; i < trials; i++) {
            long peopleInRoom = 0;
            for (int j = 0; j < n; j++) birthdayList[j] = -1;
            while (true) {
                double random = Math.random() * n;
                int randomBirthday = (int) random;
                if (birthdayList[randomBirthday] != -1) {
                    cntArr[(int) peopleInRoom]++;
                    break;
                } else {
                    peopleInRoom++;
                    birthdayList[randomBirthday] = randomBirthday;
                }
            }

        }
        while (true) {
            avg += (double) cntArr[index] / trials;
            System.out.println(index + 1 + " " + (int) cntArr[index] + " " + avg);
            index++;
            if (avg >= 0.500000) break;
        }
    }
}
