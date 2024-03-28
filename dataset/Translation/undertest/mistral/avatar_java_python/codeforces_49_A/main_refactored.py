class main:
    import sys
    
    def is_vowel(ch):
        return ch.lower() in ['a', 'e', 'i', 'o', 'u', 'y']
    
    def is_question(question):
        if question[-1] not in ['?', '!']:
            return False
        return True
    
    def main():
        question = input()
        if not is_question(question):
            print("Invalid input")
            sys.exit()
        vowels = ['A', 'E', 'I', 'O', 'U', 'Y']
        if any(is_vowel(ch) for ch in question[-1:]):
            print("YES")
        else:
            print("NO")
    
    if __name__ == "__main__":
        main()