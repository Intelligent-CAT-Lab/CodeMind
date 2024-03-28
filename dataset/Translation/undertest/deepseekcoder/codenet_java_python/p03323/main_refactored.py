class main:
    import sys
    
    def main():
        a, b = map(int, sys.stdin.readline().split())
        if a <= 8 and b <= 8:
            print("Yay!")
        else:
            print(":(")
    
    if __name__ == "__main__":
        main()