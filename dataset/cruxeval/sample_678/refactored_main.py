text = "HI"
freq = dict()
for c in text.lower():
    if c in freq:
        freq[c] += 1
    else:
        freq[c] = 1
print(freq)