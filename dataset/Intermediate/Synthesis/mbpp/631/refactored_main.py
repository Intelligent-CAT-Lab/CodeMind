text = 'Jumanji The Jungle'
print("".join(" " if c == "_" else ("_" if c == " " else c) for c in text))