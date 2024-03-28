class main:
    import math
    import sys
    
    def gcd(a, b):
        return math.gcd(a, b)
    
    def main():
        z = input().split()
        x = int(z[0])
        y = int(z[1])
        a = int(z[2])
        b = int(z[3])
    
        c = 0
        lcm = x * y // gcd(x, y)
    
        for i in range(a, b + 1):
            if i % lcm == 0:
                break
    
        for j in range(b, a - 1, -1):
            if j % lcm == 0:
                break
    
        if j % lcm == 0 and i % lcm == 0:
            c = (j - i) // lcm + 1
    
        print(c)
        
    if __name__ == '__main__':
        main()