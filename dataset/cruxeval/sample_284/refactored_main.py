text = 'bestest'
prefix = 'bestest'
idx = 0
for letter in prefix:
    if text[idx] != letter:
        print(None)
        break
    idx += 1
print(text[idx:])