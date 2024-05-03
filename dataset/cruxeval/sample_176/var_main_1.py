def f(text, to_place):
    after_place = text[:text.find(to_place, 0) + 1]	## after_place = CLRJ | text = CLRJ | to_place = CLRJ
    before_place = text[text.find(to_place, 0) + 1:]	## before_place = CLRJ | text = CLRJ | to_place = CLRJ
    return after_place + before_place	## after_place = CLRJ | before_place = CLRJ
