class main:
    import sys
    
    def main():
        input = sys.stdin.readline().split()
        A = int(input[0])
        B = int(input[1])
        print(A*B)
    
    if __name__ == '__main__':
        main()