class main:
    import math
    
    def factorialsModBillion(n, m):
        result = 1
        for i in range(1, n+1):
            result = (result * i) % 1000000007
        for i in range(1, m+1):
            result = (result * i) % 1000000007
        return result
    
    def main():
        n, m = map(int, input().split())
        if abs(n-m) > 1:
            result = 0
        elif abs(n-m) == 1:
            result = factorialsModBillion(n, m)
        else:
            result = factorialsModBillion(n, m)
            result = (result * 2) % 1000000007
        print(result)
    
    if __name__ == '__main__':
        main()