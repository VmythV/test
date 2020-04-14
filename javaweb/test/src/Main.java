import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()){
            int n = cin.nextInt();
            int[] a = new int[n+1];
            for (int i = 0; i <= n; i++) {
                a[i] = i;
            }
            long[] b = new long[n+1];
            b[0] = a[0];
            for (int i = 1; i <= n; i++) {
                b[i] = b[i-1] + a[i];
            }
            for (int p = 0;p<=n;p++){
                long x = b[p];
                long y = n + x;
                int q = Arrays.binarySearch(b,y);
                if (q>p+1){
                    System.out.println(p+1 +" "+q);
                }
            }
        }
        cin.close();
    }
}
