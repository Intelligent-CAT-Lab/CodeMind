import re

def count_less_than_a(string):
    count = 0
    for char in string:
        if char <= 'A':
            count += 1
    return count

print(count_less_than_a("AIZU"))