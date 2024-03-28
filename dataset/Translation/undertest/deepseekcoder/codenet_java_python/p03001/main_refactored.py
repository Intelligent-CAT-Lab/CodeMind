class main:
    import sys
    
    def main():
        w, h, x, y = map(int, sys.stdin.readline().split())
        ans = (w * h) / 2
        a = 0
        if x * 2 == w and y * 2 == h:
            a = 1
        print(f"{ans} {a}")
    
    if __name__ == "__main__":
        main()