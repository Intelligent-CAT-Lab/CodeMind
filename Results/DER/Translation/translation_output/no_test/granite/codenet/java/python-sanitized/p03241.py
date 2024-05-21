import java.util.*;

public class p03241:
    public static void main(String[] a):
        s = Scanner(System.in)
        n = s.nextInt()
        m = s.nextInt()
        for i in range(m // n, 0, -1):
            if m % i == 0:
                print(i)
                break