import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class p02873 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String S = br.readLine().trim();
            // To replace the commented out lines, you need to check how the input
            // should be read and parsed into the variables l, A, B, C, and S (as a list of integer lists)
            // Uncomment and adjust following lines as per your specific input requirements:
            // ArrayList<Integer> l = parseLineOfIntegers(br);
            // int A = l.get(0), B = l.get(1), C = l.get(2);
            // ArrayList<ArrayList<Integer>> S = new ArrayList<>();
            // for (int _ = 0; _ < h; _++) { // Ensure `h` is defined somewhere in your code
            //     S.add(parseLineOfIntegers(br));
            // }

            int n = S.length() + 1;
            int[] sho = new int[n];
            int[] dai = new int[n];

            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) == '>') {
                    sho[i + 1] = 0;
                } else {
                    sho[i + 1] = sho[i] + 1;
                }
            }

            for (int i = S.length() - 1; i >= 0; i--) {
                if (S.charAt(i) == '<') {
                    dai[i] = 0;
                } else {
                    dai[i] = dai[i + 1] + 1;
                }
            }

            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += Math.max(sho[i], dai[i]);
            }

            System.out.println(sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // Utility method for input parsing; you will need to implement this according to your input format
    // Example method to parse a line of space-separated integers into an ArrayList<Integer>
    private static ArrayList<Integer> parseLineOfIntegers(BufferedReader br) throws IOException {
        String[] parts = br.readLine().trim().split(" ");
        ArrayList<Integer> nums = new ArrayList<>();
        for (String part : parts) {
            nums.add(Integer.parseInt(part));
        }
        return nums;
    }
}