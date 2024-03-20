import java.util.Scanner;

public class p02842 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[50001];
        for (int i = 1; i < 50001; i++) {
            arr[i] = (int) (i *