sentence = 'XYZ LittleRedRidingHood LiTTleBIGGeXEiT fault'
ls = list(sentence)
for letter in ls:
    if not letter.istitle():
        ls.remove(letter)
print(''.join(ls))