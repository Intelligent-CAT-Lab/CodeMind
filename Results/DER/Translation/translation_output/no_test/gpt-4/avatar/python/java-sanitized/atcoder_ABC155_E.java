import java.util.Scanner;
import java.awt.datatransfer.*;
import java.awt.Toolkit;
import java.io.*;

public class atcoder_ABC155_E {
    private static final int MOD = 1000000007;
    private static boolean isTest = false;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Define input method as required
        // For this example, we'll use console input
        int usingMethod = 2;
        
        if (isTest) {
            // Set up input method for testing if needed
            setupInputMethod(usingMethod);
        }

        int ret = main_minChange();
        if (ret != Integer.MAX_VALUE) {
            System.out.println(ret);
        }
    }

    public static int main_minChange() {
        String s = scanner.nextLine();
        int pmin = 1000, mmin = 0;
        s = '0' + s;
        StringBuilder reversed = new StringBuilder(s).reverse();
        
        for (int i = 0; i < reversed.length(); i++) {
            int v = Character.getNumericValue(reversed.charAt(i));
            int npmin = Math.min(pmin + 10 - (v + 1), mmin + 10 - v);
            int nmmin = Math.min(pmin + v + 1, mmin + v);
            pmin = npmin;
            mmin = nmmin;
        }
        return Math.min(pmin, mmin);
    }

    public static void main_b() {
        String s = scanner.nextLine();
        int pp = 0, na = 0;
        StringBuilder reversed = new StringBuilder(s).reverse();
        for (int i = 0; i < reversed.length(); i++) {
            char c = reversed.charAt(i);
            int cc = na + (c - '0');
            na = 0;
            if (cc <= 4) {
                pp += cc;
            } else {
                na = 1;
                if (i == reversed.length() - 1) {
                    pp += 1;
                }
                pp += 10 - cc;
            }
        }
        System.out.println(pp);
    }

    public static int[] intArrayInput() {
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int[] result = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            result[i] = Integer.parseInt(parts[i]);
        }
        return result;
    }

    public static void setupInputMethod(int usingMethod) {
        if (usingMethod == 0) {
            // Clipboard method for input
            String input = getClipboardContents();
            scanner = new Scanner(input);
        } else if (usingMethod == 1) {
            // File method for input
            try {
                scanner = new Scanner(new File("inputFile.txt"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        // Otherwise, use standard input (keyboard)
    }

    public static String getClipboardContents() {
        try {
            return (String) Toolkit.getDefaultToolkit().getSystemClipboard()
                .getData(DataFlavor.stringFlavor);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public static void pa(Object v) {
        if (isTest) {
            System.out.println(v);
        }
    }
}