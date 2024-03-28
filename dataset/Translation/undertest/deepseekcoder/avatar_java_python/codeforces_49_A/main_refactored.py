class main:
    import re
    
    def is_vowel(ch):
        vowels = ['A', 'E', 'I', 'O', 'U', 'Y']
        return ch in vowels
    
    def check_question(question):
        originalQ = question[:-1]
        ch = question[-1]
        return is_vowel(ch) or is_vowel(ch.lower())
    
    def main():
        question = input().strip()
        print("YES" if check_question(question) else "NO")
    
    if __name__ == "__main__":
        main()