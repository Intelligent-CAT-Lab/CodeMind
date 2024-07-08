import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int L = sc.nextInt();
        int jump_time_L = D / L;
        // System.out.println(jump_time_L);
        int jump_time = jump_time_L + (D - (L * jump_time_L));
        System.out.println(jump_time);
    }
}
