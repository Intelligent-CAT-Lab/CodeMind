text = 'The quick brown fox jumps over the lazy dog.'
pattern = 'fox'
match = re.search(pattern, text)
s = match.start()
e = match.end()
print((match.re.pattern, s, e))