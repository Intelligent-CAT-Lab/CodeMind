class main:
    import sys
    
    def is_palindrome(s):
        for i in range(len(s) // 2):
            if s[i] != s[-i - 1]:
                return False
        return True
    
    def run():
        n = int(input())
        for i in range(10 ** 9 + 7):
            if is_palindrome(str(n - i)):
                print(n - i)
                break
            if is_palindrome(str(n + i)):
                print(n + i)
                break
    
    if __name__ == "__main__":
        run()