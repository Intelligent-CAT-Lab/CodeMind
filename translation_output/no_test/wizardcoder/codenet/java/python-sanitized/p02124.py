import java.util.Scanner;

public class p02124:
    def main(args):
        sc = Scanner(System.in)
        ans = "ai1333"
        x = sc.nextInt()
        for i in range(x//100):
            ans += "3"
        print(ans)