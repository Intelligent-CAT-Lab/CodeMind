text = 'abixaaaily'
prefix = 'al'
if text.startswith(prefix):
    print(text.removeprefix(prefix))
elif prefix in text:
    print(text.replace(prefix, '').strip())
else:
    print(text.upper())