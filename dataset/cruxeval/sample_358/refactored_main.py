text = 'btrburger'
value = 'b'
indexes = []
for i in range(len(text)):
    if text[i] == value and (i == 0 or text[i-1] != value):
        indexes.append(i) 
if len(indexes) % 2 == 1:
    print(text)
else:
    print(text[indexes[0]+1:indexes[-1]])