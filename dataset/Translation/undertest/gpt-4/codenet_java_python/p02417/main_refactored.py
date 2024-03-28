class main:
    def count_letters(text):
        res = [0] * 26
    
        for char in text:
            if char.isalpha():
                res[ord(char.lower()) - ord('a')] += 1
    
        for i in range(26):
            print(f"{chr(i + ord('a'))} : {res[i]}")
    
    # Test the function
    input_text = "This is a pen."
    count_letters(input_text)