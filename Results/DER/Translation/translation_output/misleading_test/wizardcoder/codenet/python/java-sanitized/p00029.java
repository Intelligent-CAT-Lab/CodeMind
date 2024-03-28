import java.util.*;

public class p00029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = input.split(" ");
        String max1 = "";
        String max2 = "";
        int count1 = 0;
        int count2 = 0;
        for (String s : arr) {
            if (s.length() > max