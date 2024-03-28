class main:
    def is_palindrome(s):
        count = [0] * 256
        for i in s:
            count[ord(i)] += 1
        odd = 0
        for i in count:
            if i % 2 == 1:
                odd += 1
            if odd > 1:
                return "No"
        return "Yes"
    
    print(is_palindrome(input()))