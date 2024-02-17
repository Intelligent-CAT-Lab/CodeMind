replace = '###'
text = "ph>t#A#BiEcDefW#ON#iiNCU"
hide = '.'
while hide in text:
    replace += 'ax'
    text = text.replace(hide, replace, 1)
print(text)