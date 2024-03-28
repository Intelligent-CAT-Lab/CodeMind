import java.util.Scanner;

public class atcoder_ABC149_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int prime = X;
        int mid = prime / 2;
        boolean flag = False;
        
        while (True):
            for (int i = 2; i <= mid; ++i):
                if (prime % i == 0):
                    flag = True;
                    break;
            if (!flag):
                break;
            else:
                flag = False;
            prime++;
        System.out.println(prime);
    }
}