text = "398 Is A Poor Year To Sow"
text = text.replace(' x', ' x.')
if text.istitle(): 
    print('correct')
else:
    text = text.replace(' x.', ' x')
    print('mixed')