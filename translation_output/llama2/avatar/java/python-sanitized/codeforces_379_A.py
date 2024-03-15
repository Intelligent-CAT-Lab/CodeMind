import java.util

class codeforces_379_A:
    def main(self, args):
        a = int(input())
        b = int(input())
        res = a
        
        while a >= b:
            res += (a / b)
            a = (a / b) + (a % b)
        
        print(res)