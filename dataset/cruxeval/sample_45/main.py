def f(text, letter):
    counts = {}
    for char in text:
        if char not in counts:
            counts[char] = 1
        else:
            counts[char] += 1
    return counts.get(letter, 0)