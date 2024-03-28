class main:
    import sys
    
    def main():
        a, b = map(float, sys.stdin.readline().split())
        bb = int((b * 100) + 0.1)
        ans = (a * bb) // 100
        print(ans)
    
    if __name__ == "__main__":
        main()