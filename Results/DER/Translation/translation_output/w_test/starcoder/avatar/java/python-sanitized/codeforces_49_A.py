import string

def is_vowel(ch):
    return ch in "AEIOUYaeiouy"

def is_question(question):
    original_question = question[:-1]
    ch = original_question[-1]
    return is_vowel(ch) or is_vowel(ch.lower())

if __name__ == "__main__":
    question = input()
    print("YES" if is_question(question) else "NO")