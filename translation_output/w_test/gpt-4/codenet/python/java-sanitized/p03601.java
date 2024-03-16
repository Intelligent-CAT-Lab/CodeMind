import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class p03601 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        
        int[] list = new int[parts.length];
        
        for (int i = 0; i < parts.length; i++) {
            list[i] = Integer.parseInt(parts[i]);
        }
        
        int e = list[4];
        int f = list[5];
        
        int a = list[0];
        int b = list[1];
        
        // x values
        List<Integer> listx = new ArrayList<>();
        
        int i = 0;
        while (true) {
            if (i * a * 100 > f) {
                break;
            }
            int j = 0;
            while (true) {
                int x = i * a * 100 + j * b * 100;
                if (x > f) {
                    break;
                }
                if (x == 0) {
                    j++;
                    continue;
                }
                if (!listx.contains(x)) {
                    listx.add(x);
                }
                j++;
            }
            i++;
        }
        
        int c = list[2];
        int d = list[3];
        
        // y values
        List<Integer> listy = new ArrayList<>();
        
        //