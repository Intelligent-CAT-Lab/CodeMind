import java.util.*;

public class p02963:
    def main(i):
        s = Long.parseLong(Scanner(System.in).nextLine())
        a = 1000000000
        print("0 0", a, "1", (a-s%a)%a, (s-1)//a+1)