import re

def is_vowel(ch):
    vowels = ['a', 'e', 'i', 'o', 'u', 'y']
    return ch.lower() in vowels

def is_last_vowel(question):
    ch = question[-1]
    return is_vowel(ch)

question = input().strip()
original_question = question[:-1].strip()
last_char = original_question[-1]

if is_last_vowel(original_question):
    print('N')
else:
    print('Y')