import re

def is_vowel(ch):
    vowels = ["A", "E", "I", "O", "U", "Y"]
    return ch.upper() in vowels

def is_consonant(ch):
    return not is_vowel(ch)

def is_question(ch):
    return ch == "?"

def is_valid_input(input_string):
    return all(map(lambda x: is_vowel(x) or is_consonant(x) or is_question(x), input_string))

def get_answer(input_string):
    if not is_valid_input(input_string):
        return "NO"
    vowels = ["A", "E", "I", "O", "U", "Y"]
    last_char = input_string[-1]
    if last_char in vowels:
        return "YES"
    return "NO"

input_string = "BueDOlxgzeNlxrzRrMbKiQdmGujEKmGxclvaPpTuHmTqBp?"
print(get_answer(input_string))