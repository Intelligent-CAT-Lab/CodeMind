text = '. C.'
for i in ['.', '!', '?']:
    if text.endswith(i):
        result = True
    else:
        result = False
print(result)