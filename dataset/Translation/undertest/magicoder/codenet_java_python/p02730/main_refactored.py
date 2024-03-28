class main:
    def is_palindrome(s):
        for i in range(len(s)//2):
            if s[i] != s[-i-1]:
                return "No"
        for i in range(len(s)//2-1):
            if s[i] != s[len(s)//2-i-1]:
                return "No"
        return "Yes"
    
    print(is_palindrome(input()))