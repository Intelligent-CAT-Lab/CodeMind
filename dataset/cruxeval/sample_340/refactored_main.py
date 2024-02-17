text = 'E jIkx HtDpV G'
uppercase_index = text.find('A')
if uppercase_index >= 0:
    print(text[:uppercase_index] + text[text.find('a') + 1 :])
else:
    print(''.join(sorted(text)))