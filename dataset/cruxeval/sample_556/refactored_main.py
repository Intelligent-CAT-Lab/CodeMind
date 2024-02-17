text = '\n\n\t\tz\td\ng\n\t\t\te'
for i in range(len(text)):
    if text[i] == ' ':
        text = text.replace(' ', '\t', 1)
print(text.expandtabs(4))