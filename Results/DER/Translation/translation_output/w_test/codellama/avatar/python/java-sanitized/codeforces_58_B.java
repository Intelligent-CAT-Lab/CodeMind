public class codeforces_58_B {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        for (int i = a; i > 0; i--) {
            if (a % i == 0) {
                System.out.print(i + " ");
                a = i;
            }
        }
        System.out.println();
    }
}


For example, if the input is 733035, the output will be:

733035 244345 48869 1