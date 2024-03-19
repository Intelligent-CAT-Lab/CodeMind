import java.util.Scanner;

public class p03523 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = "";

        if (input.replace("A", "").equals("KIHBR")) {
            String[] splitInput = input.split("");
            int[] lengths = new int[splitInput.length];
            for (int i = 0; i < splitInput.length; i++) {
                lengths[i] = splitInput[i].length();
            }
            int[] expectedLengths = {1, 0, 0, 1, 1, 1, 1};
            boolean allLengthsValid = true;
            for (int i = 0; i < lengths.length; i++) {
                if (lengths[i] > expectedLengths[i]) {
                    allLengthsValid = false;
                    break;
                }
            }
            if (allLengthsValid) {
                output = "spC";
            } else {
                output = "YNEOS";
            }
        } else {
            output = "YNEOS";
        }

        System.out.println(output);
    }
}