class main:
    import math
    
    def main():
        n, k = map(int, input().split())
        print((math.ceil(n / k)) * k)
    
    if __name__ == "__main__":
        main()