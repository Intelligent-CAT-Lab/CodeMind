def f(text, letter):
    t = text	## t = [] | text = []
    for alph in text:	## alph = [] | text = []
        t = t.replace(alph, "")	## t = [] | alph = []
    return len(t.split(letter))	## t = [] | letter = []
