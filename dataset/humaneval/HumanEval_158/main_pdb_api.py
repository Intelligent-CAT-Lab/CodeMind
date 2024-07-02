from typing import *
def find_max(words):
    return sorted(words, key = lambda x: (-len(set(x)), x))[0]

find_max(["name", "of", "string"])