def f(text):
    new_text = []	## new_text = CLRJ
    for i in range(len(text) // 3):	## text = CLRJ
        new_text.append(f"< {text[i * 3: i * 3 + 3]} level={i} >")
    last_item = text[len(text) // 3 * 3:]	## last_item = CLRJ | text = CLRJ
    new_text.append(f"< {last_item} level={len(text) // 3} >")	## new_text = CLRJ | last_item = CLRJ | text = CLRJ
    return new_text	## new_text = CLRJ
