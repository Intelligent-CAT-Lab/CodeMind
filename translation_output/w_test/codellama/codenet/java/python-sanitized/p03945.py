import java.util.Scanner;

public class p03945 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        String[] str = new String[s.length()];
        int counter = 0;
        for (int i = 0; i < str.length; i++) {
            str[i] = s.substring(i, i + 1);
        }
        for (int i = 0; i < str.length - 1; i++) {
            if (!str[i].equals(str[i + 1])) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}




s = input("Enter a string: ")
counter = 0
for i in range(len(s)):
    if s[i] == s[i+1]:
        counter += 1
print(counter)