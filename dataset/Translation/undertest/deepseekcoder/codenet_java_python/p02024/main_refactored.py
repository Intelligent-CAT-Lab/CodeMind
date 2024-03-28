class main:
    import sys
    
    def main():
        h, w, s, t = map(int, sys.stdin.readline().split())
        if h * w % 2 == 1 and (s * w + t) % 2 == 1:
            print("No")
        else:
            print("Yes")
    
    if __name__ == "__main__":
        main()