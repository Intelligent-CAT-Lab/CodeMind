sentences = 'not numbers'
if all([sentence.isdecimal() for sentence in sentences.split('.')]):
    result = 'oscillating' 
else:
    result = 'not oscillating'
print(result)