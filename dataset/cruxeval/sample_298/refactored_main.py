text = 'dst vavf n dmv dfvm gamcu dgcvb.'
new_text = list(text)
for i in range(len(new_text)):
    character = new_text[i]
    new_character = character.swapcase()
    new_text[i] = new_character
print(''.join(new_text))