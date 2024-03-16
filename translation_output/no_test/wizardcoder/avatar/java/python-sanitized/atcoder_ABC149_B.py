import java.util.*;

class atcoder_ABC149_B:
    def main(self):
        stdIn = Scanner(System.in)
        A = Long.parseLong(stdIn.next())
        B = Long.parseLong(stdIn.next())
        K = Long.parseLong(stdIn.next())
        n = A - K
        
        if A + B <= K:
            print("0 0")
        elif n < 0:
            print("0", A + B - K)
        else:
            print(n, B)

atcoder_ABC149_B().main()