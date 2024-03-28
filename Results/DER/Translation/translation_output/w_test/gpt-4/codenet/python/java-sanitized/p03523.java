import java.util.Scanner;

public class p03523 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        boolean b = s.replace("A", "").equals("KIHBR");

        if (b) {
            String replacedString = s.replaceAll("[^A]", "*");
            String[] splitArray = replacedString.split("\\*");
            int[] lengths = new int[splitArray.length];
            
            // Copying the lengths of the split parts
            for (int i = 0; i < splitArray.length; i++) {
                lengths[i] = splitArray[i].length();
            }
            
            //