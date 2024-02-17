text = "odes\tcode\twell"
tabstop = 2
text = text.replace('\n', '_____')
text = text.replace('\t', tabstop * ' ')
text = text.replace('_____', '\n')
print(text)