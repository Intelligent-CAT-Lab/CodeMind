import java.util.Scanner;
import java.util.ArrayList;

public class codeforces_369_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        
        // Read integers and add them to the list
        for (int i = 0; i < 6; i++) {
            arr.add(scanner.nextInt());
        }
        
        int rem = 0;
        int ones = 0;
        ArrayList<Integer> string = new ArrayList<>();
        
        ones = arr.get(5) % arr.get(1);
        for (int i = 0; i < arr.get(1); i++) {
            string.add(arr.get(5) / arr.get(1) + (ones > 0 ? 1 : 0));
            ones--;
        }
        
        if (!arr.get(0).equals(arr.get(1))) {
            rem = arr.get(4) - arr.get(5);
            ones = rem % (arr.get(0) - arr.get(1));
            for (int i = arr.get(1); i < arr.get(0); i++) {
                string.add(rem / (arr.get(0) - arr.get(1)) + (ones > 0 ? 1 : 0));
                ones--;
            }
        }
        
        for (int num : string) {
            System.out.print(num + " â ");
        }
        
        scanner.close();
    }
}