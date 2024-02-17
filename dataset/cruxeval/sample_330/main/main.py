def f(text):
    ans = []
    for char in text:
        if char.isdigit():
            ans.append(char)
        else:
            ans.append(' ')
    return ''.join(ans)