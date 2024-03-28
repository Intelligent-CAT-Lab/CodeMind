import java.util.Scanner
import java.io.PrintWriter

public class p02797:
    def main(args):
        sc = Scanner(System.in)
        out = PrintWriter(System.out)
        N = Integer.parseInt(sc.next())
        K = Integer.parseInt(sc.next())
        S = Integer.parseInt(sc.next())
        if K == 0:
            if S == 1000000000:
                for i in range(N):
                    out.print("1 ")
            else:
                S += 1
                for i in range(N):
                    out.print(S + " ")
        else:
            for i in range(N):
                if i < K:
                    out.print(S + " ")
                else:
                    if S == 1000000000:
                        out.print("1 ")
                    else:
                        out.print(S + 1)
                        out.print(" ")

        #ãã³ãã¬
        sc.close()
        out.flush()