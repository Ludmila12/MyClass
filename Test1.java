package Lernen;
import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        int[] arrMain = new int[10];
        for (int i = 0; i < arrMain.length; i++) {
            arrMain[i]=sc2.nextInt();
        }
        int[] arr1 = new int[arrMain.length/2];
        int[] arr2 = new int[arrMain.length/2];

        for (int i = 0; i < arrMain.length/2; i++) {
            arr1[i] = arrMain[i];
            arr2[i] = arrMain[i + arrMain.length/2];
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
