def f(text):
    new_text = []	## <state>new_text = CLRJ</state>
    for i in range(len(text) // 3):	## <state>text = CLRJ</state>
        new_text.append(f"< {text[i * 3: i * 3 + 3]} level={i} >")
    last_item = text[len(text) // 3 * 3:]	## <state>last_item = CLRJ | text = CLRJ</state>
    new_text.append(f"< {last_item} level={len(text) // 3} >")	## <state>new_text = CLRJ | last_item = CLRJ | text = CLRJ</state>
    return new_text	## <state>new_text = CLRJ</state>
