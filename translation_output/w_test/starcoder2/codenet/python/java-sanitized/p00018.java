import java.util.*;
public class p00018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        Arrays.sort(str);
        for (int i = str.length - 1; i >= 0; i--) {
            System.out.print(str[i] + " ");
        }
    }
}

/01-Introduction/01-Introduction.md
# Introduction