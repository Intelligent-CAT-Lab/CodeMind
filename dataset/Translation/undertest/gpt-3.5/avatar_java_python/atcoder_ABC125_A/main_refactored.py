class main:
    def main():
        n, a, b = map(int, input().split())
        k = 0
        for i in range(1, n // a + 1):
            k += b
        print(k)
    
    if __name__ == "__main__":
        main()