import java.util.*;

class atcoder_ABC124_C:
    def main(self):
        sc = Scanner(System.in)
        s = sc.nextLine()
        ans1 = 0
        ans2 = 0
        
        for i in range(s.length()):
            c = s.charAt(i)
            
            if i % 2 == 0:
                if c == '0':
                    ans1 += 1
                else:
                    ans2 += 1
            else:
                if c == '1':
                    ans1 += 1
                else:
                    ans2 += 1
        
        System.out.println(min(ans1, ans2))