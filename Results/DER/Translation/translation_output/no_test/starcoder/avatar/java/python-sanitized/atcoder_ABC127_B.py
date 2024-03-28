import java.util.*;

class atcoder_ABC127_B:
    def main(self):
        sc = Scanner(System.in)
        r = Integer.parseInt(sc.next())
        d = Integer.parseInt(sc.next())
        x = Integer.parseInt(sc.next())

        for i in range(10):
            x = r * x - d
            System.out.println(x)

if __name__ == '__main__':
    atcoder_ABC127_B().main()