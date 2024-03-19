import re

def is_vowel(ch):
    vowels = ["A", "E", "I", "O", "U", "Y"]
    return ch.upper() in vowels

def is_consonant(ch):
    return not is_vowel(ch)

def is_palindrome(word):
    return word == word[::-1]

def solve(question):
    question = question.strip()
    original_q = question[:-1].strip()
    ch = original_q[-1]
    if is_vowel(ch):
        return "YES"
    elif is_consonant(ch):
        if is_palindrome(original_q):
            return "YES"
        else:
            return "NO"
    else:
        return "NO"

print(solve("BueDOlxgzeNlxrzRrMbKiQdmGujEKmGxclvaPpTuHmTqBp?"))