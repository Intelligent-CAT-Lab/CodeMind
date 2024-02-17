text = 'eftw{ьТсk_1'
value = '\\'
if isinstance(value, str):
    print(text.count(value) + text.count(value.lower()))
else:
    print(text.count(value))