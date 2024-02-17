text = 'E wrestled evil until upperfeat'
letter = 'e'
if letter.islower(): 
    letter = letter.upper()
text = ''.join([letter if char == letter.lower() else char for char in text])
print(text.capitalize())