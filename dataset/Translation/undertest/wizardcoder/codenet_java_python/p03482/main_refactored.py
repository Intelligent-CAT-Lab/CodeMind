class main:
    import java.util.Scanner;
    
    class p03482:
        def main(self):
            scan = Scanner(System.in)
            S = scan.next()
            ans = 0
            if S.length() % 2 == 0:
                if S.charAt(S.length() // 2 - 1)!= S.charAt(S.length() // 2):
                    print(S.length() // 2)
                    return
                else:
                    S = S[:S.length() // 2] + S[S.length() // 2 + 1:]
                    ans = 1
            mid = S.length() // 2
            for i in range(1, S.length() - mid + 1):
                if i + mid == S.length() or S[mid + i]!= S[mid] or S[mid - i]!= S[mid]:
                    ans += mid + i
                    break
            print(ans)
    
    p03482().main()