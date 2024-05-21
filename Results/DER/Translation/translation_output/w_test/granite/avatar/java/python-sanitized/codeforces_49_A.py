def is_vowel(c):
    vowels = ['A', 'E', 'I', 'O', 'U', 'Y']
    return c.upper() in vowels or c.lower() in vowels

def main():
    question = input().strip()
    original_q = question[:-1].strip()
    last_char = original_q[-1]
    if is_vowel(last_char):
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()