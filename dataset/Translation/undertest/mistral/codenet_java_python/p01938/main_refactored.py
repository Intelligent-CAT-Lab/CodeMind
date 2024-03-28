class main:
    import sys
    
    def main():
        list = sys.stdin.readline().strip().split()
        a = ord('A')
        sum = 0
        for i in range(len(list)):
            if ord(list[i]) <= a:
                sum += 1
            a = ord(list[i])
        print(sum)
    
    if __name__ == '__main__':
        main()