class main:
    import sys
    
    def main():
        N = int(input())
        while N > 0:
            sum = 0
            for i in range(1, sys.maxsize):
                sum += i
                if sum >= N:
                    print(i)
                    N -= i
                    break
    
    if __name__ == "__main__":
        main()