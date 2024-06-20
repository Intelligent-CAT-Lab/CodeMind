def is_palindrome(text: str):
    for i in range(len(text)):
        if text[i] != text[len(text) - i]:
            return False
    return True
