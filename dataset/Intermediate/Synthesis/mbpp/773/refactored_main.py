text = 'python programming, python language'
pattern = 'python'
for match in re.finditer(pattern, text):
    s = match.start()
    e = match.end()
    print((text[s:e], s, e))