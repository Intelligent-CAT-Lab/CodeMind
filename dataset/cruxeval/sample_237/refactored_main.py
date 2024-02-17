text = 'uzlwaqiaj'
char = 'u'

if char in text:
    suff, char, pref = text.partition(char)
    pref = suff[:-len(char)] + suff[len(char):] + char + pref
    reformated_text = suff + char + pref
else:
    reformated_text = text

print(reformated_text)