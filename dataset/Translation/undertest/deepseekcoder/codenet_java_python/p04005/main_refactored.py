class main:
    import sys
    
    def main():
        A, B, C = map(int, sys.stdin.readline().split())
    
        numbers = [A, B, C]
        numbers.sort()
    
        if A % 2 == 0 or B % 2 == 0 or C % 2 == 0:
            print(0)
        else:
            print(numbers[0] * numbers[1])
    
    if __name__ == "__main__":
        main()