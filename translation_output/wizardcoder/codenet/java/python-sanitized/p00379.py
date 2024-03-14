import java.util.Scanner;

class p00379:
    def main(self):
        sc = Scanner(System.in)
        
        a = sc.nextInt()
        n = sc.nextInt()
        m = sc.nextInt()
        max = int(m ** (1/n))
        
        ans = 0
        for i in range(1, max+1):
            x = int(i ** n)
            str = str(x)
            y = 0
            for j in range(len(str)):
                y += int(str[j])
            
            if y + a == i:
                ans += 1
        
        print(ans)

p00379().main()