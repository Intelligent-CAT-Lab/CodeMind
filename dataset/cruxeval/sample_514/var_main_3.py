def f(text):
    for item in text.split():	## <state>item = CLRJ | text = CLRJ</state>
        text = text.replace('-{}'.format(item), ' ').replace('{}-'.format(item), ' ')	## <state>text = CLRJ | item = CLRJ</state>
    return text.strip('-')	## <state>text = CLRJ</state>
