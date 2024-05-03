def f(text, letter):
    counts = {}	## counts = []
    for char in text:	## char = [] | text = []
        if char not in counts:	## char = [] | counts = []
            counts[char] = 1	## counts = [] | char = []
        else:
            counts[char] += 1	## counts = [] | char = []
    return counts.get(letter, 0)	## counts = [] | letter = []
