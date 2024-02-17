text = 'xxjarczx'
delimiter = 'x'
text = text.rpartition(delimiter)
print(text[0] + text[-1])