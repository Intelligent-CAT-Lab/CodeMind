class main:
    import sys
    
    def is_palindrome(s):
        return s == s[::-1]
    
    def main():
        s = sys.stdin.readline().strip()
        if is_palindrome(s):
            print("Yes")
        else:
            print("No")
    
    if __name__ == "__main__":
        main()