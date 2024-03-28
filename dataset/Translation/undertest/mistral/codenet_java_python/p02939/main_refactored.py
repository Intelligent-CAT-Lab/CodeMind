class main:
    import sys
    
    def main():
        s = sys.stdin.readline().strip()
        n = len(s)
        count = 0
        for i in range(n):
            count += 1
            if i + 1 >= n:
                break
            if s[i] == s[i + 1]:
                if i + 2 >= n:
                    break
                i += 2
                count += 1
        print(count)
    
    if __name__ == "__main__":
        main()