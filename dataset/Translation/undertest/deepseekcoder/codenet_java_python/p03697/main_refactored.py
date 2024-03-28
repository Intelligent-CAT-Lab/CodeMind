class main:
    import sys
    
    def main():
        a, b = map(int, sys.stdin.readline().split())
        if a + b >= 10:
            print("error")
        else:
            print(a + b)
    
    if __name__ == "__main__":
        main()