class main:
    def main():
        n = int(input().strip())
        s = " "
        for i in range(1, n + 1):
            s += str(i)
        print(s[n])
    
    if __name__ == "__main__":
        main()