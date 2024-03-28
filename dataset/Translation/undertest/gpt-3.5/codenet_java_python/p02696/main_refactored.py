class main:
    def main():
        a, b, n = map(int, input().split())
        if n >= b:
            print(a * (b - 1) // b)
        else:
            print(a * n // b)
    
    if __name__ == "__main__":
        main()