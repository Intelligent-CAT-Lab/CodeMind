def is_palindrome(text: str):
    for i in range(len(text)):	## i = CLRJ|text = CLRJ
        if text[i] != text[len(text) - 1 - i]:	## text = CLRJ|i = CLRJ
            return False
    return True
