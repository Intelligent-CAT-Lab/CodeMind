class main:
    def check_palindromes(s):
        half_length = len(s) // 2
        
        # Check if the whole string is a palindrome
        for i in range(half_length):
            if s[i] != s[len(s) - 1 - i]:
                return "No"
        
        # Check if the first half of the string is a palindrome
        for i in range(half_length - 1):
            if s[i] != s[half_length - 1 - i]:
                return "No"
        
        return "Yes"
    
    # Sample test case
    print(check_palindromes("akasaka"))