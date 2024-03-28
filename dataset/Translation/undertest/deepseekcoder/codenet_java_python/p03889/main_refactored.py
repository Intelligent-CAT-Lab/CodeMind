class main:
    def is_palindrome(s):
        s = list(s)
        for i in range(len(s)):
            if s[i] == 'b':
                s[i] = 'd'
            elif s[i] == 'd':
                s[i] = 'b'
            elif s[i] == 'p':
                s[i] = 'q'
            elif s[i] == 'q':
                s[i] = 'p'
        s = ''.join(s[::-1])
        if s == s[::-1]:
            return "Yes"
        else:
            return "No"
    
    print(is_palindrome(input()))