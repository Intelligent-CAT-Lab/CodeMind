class main:
    import sys
    
    def main():
        # å
    ¥å
        n = int(sys.stdin.readline().strip())
    
        # ä¸»å¦ç
        result = 0
        for i in range(n - 1, 0, -1):
            result += i
    
        # åºå
        print(result)
    
    if __name__ == "__main__":
        main()