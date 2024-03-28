class main:
    import re
    
    def is_vowel(ch):
        vowels = ['a', 'e', 'i', 'o', 'u', 'y']
        return ch.lower() in vowels
    
    def is_valid(question):
        original_question = question[:-1]
        last_char = original_question[-1]
        return is_vowel(last_char)
    
    question = input().strip()
    if is_valid(question):
        print("YES")
    else:
        print("NO")