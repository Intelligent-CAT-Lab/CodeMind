text = 'String matching is a big part of RexEx library.'
new_text = []
for character in text:
    if character.isupper():
        new_text.insert(len(new_text) // 2, character)
if len(new_text) == 0:
    new_text = ['-']
print(''.join(new_text))