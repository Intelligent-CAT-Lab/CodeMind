text = 'akA?riu'
text_list = [char for char in text]
for i, char in enumerate(text_list):
    text_list[i] = char.swapcase()
print(''.join(text_list))