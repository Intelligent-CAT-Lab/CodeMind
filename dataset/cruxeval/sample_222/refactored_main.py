mess = '0aabbaa0b'
char = 'a'
while mess.find(char, mess.rindex(char) + 1) != -1:
    mess = mess[:mess.rindex(char) + 1] + mess[mess.rindex(char) + 2:]
print(mess)