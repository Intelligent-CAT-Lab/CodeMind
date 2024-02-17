text = 'faqo osax f'
suffix = 'f'
text += suffix
while text[-len(suffix):] == suffix:
    text = text[:-1]
print(text)