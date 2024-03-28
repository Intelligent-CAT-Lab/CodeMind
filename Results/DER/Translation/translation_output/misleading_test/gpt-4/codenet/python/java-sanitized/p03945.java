public class p03945 {
    public static void main(String[] args) {
        String testInput = "BBBWW";
        System.out.println(countTransitions(testInput));
    }

    public static int countTransitions(String input) {
        int countWB = input.contains("WB") ? 1 : 0; // Java doesn't have a direct equivalent of Python's count here
        int countBW = input.contains("BW") ? 1 : 0; // so we are checking if "WB" or "BW" are contained in the string.
        return countWB + countBW;
    }
}