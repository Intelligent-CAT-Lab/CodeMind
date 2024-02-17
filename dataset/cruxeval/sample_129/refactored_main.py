text = 'ONBPICJOHRHDJOSNCPNJ9ONTHBQCJ'
search_string = 'J'
indexes = []
while search_string in text:
    indexes.append(text.rindex(search_string))
    text = text[:text.rindex(search_string)]
print(indexes)