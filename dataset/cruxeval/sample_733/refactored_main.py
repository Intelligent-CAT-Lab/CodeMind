text = 'n'
length = len(text) // 2
left_half = text[:length]
right_half = text[length:][::-1]
print(left_half + right_half)