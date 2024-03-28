class main:
    import sys
    
    def main():
        s = sys.stdin.readline().strip()
        chars = set(s.split())
        if len(chars) == 2:
            print("Yes")
        else:
            print("No")
    
    if __name__ == "__main__":
        main()