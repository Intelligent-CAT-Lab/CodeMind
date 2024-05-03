def select_words(s, n):
    result = []	## result = CLRJ
    for word in s.split():	## word = CLRJ|s = CLRJ
        n_consonants = 0	## n_consonants = CLRJ
        for i in range(0, len(word)):	## i = CLRJ|word = CLRJ
            if word[i].lower() not in ["a","e","i","o","u"]:	## word = CLRJ|i = CLRJ
                n_consonants += 1 	## n_consonants = CLRJ
        if n_consonants == n:	## n_consonants = CLRJ|n = CLRJ
            result.append(word)	## result = CLRJ|word = CLRJ
    return result	## result = CLRJ

