sent=input()
words=sent.split()
max_f,freq_w=0,""
max_len,len_w=0,""
for word in words:
    if max_f<words.count(word):
        freq_w=word
        max_f=words.count(word)
    if max_len<len(word):
        len_w=word
        max_len=len(word)
print("%s %s"%(freq_w,len_w))