text = 'ndbtdabdahesyehu'
prefix = 'n'
while text.startswith(prefix):
    text = text[len(prefix):] or text
print(text)