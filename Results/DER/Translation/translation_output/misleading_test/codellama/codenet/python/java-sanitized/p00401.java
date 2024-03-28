public class p00401 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int count = 1;
        while (count <= N) {
            count *= 2;
        }
        System.out.println(Math.round(count/2));
    }
}



$ java Solution 54
33