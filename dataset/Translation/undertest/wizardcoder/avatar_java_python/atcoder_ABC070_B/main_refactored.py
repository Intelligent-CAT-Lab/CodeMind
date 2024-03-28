class main:
    import sys
    
    def main():
        input = sys.stdin.readline().strip().split()
        a, b, c, d = map(int, input)
        array = [0] * 101
        
        for i in range(a, b):
            array[i] += 1
        
        for i in range(c, d):
            array[i] += 1
        
        ans = 0
        for i in range(101):
            if array[i] == 2:
                ans += 1
        
        print(ans)
    
    if __name__ == '__main__':
        main()