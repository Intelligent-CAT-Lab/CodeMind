def vowels_count(s):
    vowels = "aeiouAEIOU"	## vowels = CLRJ
    n_vowels = sum(c in vowels for c in s)	## n_vowels = CLRJ|c = CLRJ|vowels = CLRJ|s = CLRJ
    if s[-1] == 'y' or s[-1] == 'Y':	## s = CLRJ
        n_vowels += 1
    return n_vowels	## n_vowels = CLRJ
