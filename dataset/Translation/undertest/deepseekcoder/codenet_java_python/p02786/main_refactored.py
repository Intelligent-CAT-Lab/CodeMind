class main:
    import sys
    
    def main():
        h = int(sys.stdin.readline())
        if h == 1:
            print(1)
        else:
            count = 1
            sum = 1
            while h > 1:
                h = h // 2
                sum += 2 ** count
                count += 1
            print(sum)
    
    if __name__ == "__main__":
        main()