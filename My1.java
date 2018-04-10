import java.util.Arrays;
import java.util.Scanner;

public class My1 {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        int[] a = new int[n];

        int b = a[0];
        a[0]=a[n-1];
        a[n-1]=b;
        String s =Arrays.toString(a);
        System.out.println(s);
    }
}
