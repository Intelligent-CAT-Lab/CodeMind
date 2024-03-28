class main:
    import sys
    
    def main():
        s = sys.stdin.readline().strip()
        a = 'A'
        sum = 0
        for i in range(len(s)):
            if s[i] <= a:
                sum += 1
            a = s[i]
        print(sum)
    
    if __name__ == '__main__':
        main()