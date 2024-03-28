class main:
    import sys
    
    def main():
        s = sys.stdin.readline().strip()
        
        if s[2] == s[3] and s[4] == s[5]:
            print("Yes")
        else:
            print("No")
    
    if __name__ == "__main__":
        main()