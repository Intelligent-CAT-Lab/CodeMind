import re

def codeforces_49_A():
    question = input().strip()
    originalQ = question[:-1].strip()
    ch = originalQ[-1].upper()
    vowels = ["A", "E", "I", "O", "U", "Y"]
    b = ch in vowels
    print("YES" if b else "NO")

# Call the function to execute
codeforces_49_A()