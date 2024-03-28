class main:
    import sys
    
    def main():
        input_str = sys.stdin.readline().strip()
        i1, i2 = map(int, input_str.split())
        count = i1 // i2
        count += i1 % i2
        print(count)
    
    if __name__ == '__main__':
        main()