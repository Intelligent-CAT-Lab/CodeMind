FIX = """
Add more test cases.
"""

def vowels_count(s):
    vowels = "aeiouyAEIOUY"
    n_vowels = sum(c in vowels for c in s)
    return n_vowels
