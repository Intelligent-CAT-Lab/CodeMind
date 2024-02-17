text = 'DSUWeqExTQdCMGpqur'
lower = 'a'
upper = 'x'
count = 0
new_text = list()
for char in text:
    char = lower if char.isdecimal() else upper
    if char in ['p', 'C']:
        count += 1
    new_text.append(char)
print(count, ''.join(new_text))