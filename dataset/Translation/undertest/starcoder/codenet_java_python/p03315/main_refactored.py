class main:
    import sys
    
    def main():
        s = sys.stdin.readline().strip()
        num = 0
        for c in s:
            if c == '+':
                num += 1
            else:
                num -= 1
        print(num)
    
    if __name__ == '__main__':
        main()