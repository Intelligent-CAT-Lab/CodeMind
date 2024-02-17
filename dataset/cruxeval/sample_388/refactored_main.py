text = "2nm_28in"
characters = "nm"
character_list = list(characters) + [' ', '_']

i = 0
while i < len(text) and text[i] in character_list:
    i += 1

print(text[i:])