text = ""
texts = text.split()
if texts:
    xtexts = [t for t in texts if t.isascii() and t not in ('nada', '0')]
    print(max(xtexts, key=len) if xtexts else 'nada')
else:
    print('nada')