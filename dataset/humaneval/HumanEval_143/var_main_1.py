def words_in_sentence(sentence):
    new_lst = []	## new_lst = CLRJ
    for word in sentence.split():	## word = CLRJ|sentence = CLRJ
        flg = 0	## flg = CLRJ
        if len(word) == 1:	## word = CLRJ
            flg = 1	## flg = CLRJ
        for i in range(2, len(word)):	## i = CLRJ|word = CLRJ
            if len(word)%i == 0:	## word = CLRJ|i = CLRJ
                flg = 1	## flg = CLRJ
        if flg == 0 or len(word) == 2:	## flg = CLRJ|word = CLRJ
            new_lst.append(word)	## new_lst = CLRJ|word = CLRJ
    return " ".join(new_lst)	## new_lst = CLRJ
