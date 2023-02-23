public class HelloWorld {
    public static void main(String[] args) {
        int n = 123456789;
        int m = 0;
        while (n != 0)
        {
            m = (10 * m) + (n % 10);
            n = n / 10;
        }
        System.out.println(m);
        int i,j;
        for (i = 0, j = 0; i < 10; i++)
            j += i;
        System.out.println(j);
    }
}
