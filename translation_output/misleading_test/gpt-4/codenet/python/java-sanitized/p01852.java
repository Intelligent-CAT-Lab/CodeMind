public class p01852 {
    public static void main(String[] args) {
        // Assuming the input number is passed as a command line argument
        int n = Integer.parseInt(args[0]);
        int numBits = (n > 0) ? Integer.toBinaryString(n).length() : 0;
        System.out.println(numBits);
    }
}