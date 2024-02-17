text = 'Hello World'
pref = 'W'
if isinstance(pref, list):
    print(', '.join(text.startswith(x) for x in pref))
else:
    print(text.startswith(pref))