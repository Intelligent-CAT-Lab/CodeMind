def f(text, to_place):
    after_place = text[:text.find(to_place, 0) + 1]	## <state>after_place = CLRJ | text = CLRJ | to_place = CLRJ</state>
    before_place = text[text.find(to_place, 0) + 1:]	## <state>before_place = CLRJ | text = CLRJ | to_place = CLRJ</state>
    return after_place + before_place	## <state>after_place = CLRJ | before_place = CLRJ</state>
