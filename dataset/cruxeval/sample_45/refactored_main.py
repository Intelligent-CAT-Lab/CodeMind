text = 'za1fd1as8f7afasdfam97adfa'
letter = '7'
counts = {}
for char in text:
    if char not in counts:
        counts[char] = 1
    else:
        counts[char] += 1
print(counts.get(letter, 0))