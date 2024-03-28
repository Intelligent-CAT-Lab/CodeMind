class main:
    import sys
    
    def main():
        n = int(sys.stdin.readline().strip())
        a = [0] * 15
        i = 0
        while n > 0:
            a[i] = (n + 1) % 3 - 1
            n = (n - a[i]) // 3
            i += 1
        while i > 0:
            print((a[i - 1] == 0) * "0" + (a[i - 1] > 0) * "+" + (a[i - 1] < 0) * "-" + (i == 1) * "\n")
            i -= 1
    
    if __name__ == "__main__":
        main()