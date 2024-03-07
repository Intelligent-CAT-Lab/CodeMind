import re

def is_vowel(ch):
    return ch.lower() in "aeiouy"

def is_question(question):
    return question.endswith("?")

def is_vowel_question(question):
    return is_vowel(question[-2]) and is_question(question)

def main():
    question = input("Enter a question: ")
    if is_vowel_question(question):
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()