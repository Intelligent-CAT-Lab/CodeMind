text = 'jysrhfm ojwesf xgwwdyr dlrul ymba bpq'
old = 'j'
new = '1'
index = text.rfind(old, 0, text.find(old))
result = list(text)
while index > 0:
    result[index:index+len(old)] = new
    index = text.rfind(old, 0, index)
print(''.join(result))