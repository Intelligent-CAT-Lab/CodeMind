def f(text):
    topic, sep, problem = text.rpartition('|')	## <state>topic = CLRJ | sep = CLRJ | problem = CLRJ | text = CLRJ</state>
    if problem == 'r':	## <state>problem = CLRJ</state>
        problem = topic.replace('u', 'p')
    return topic, problem	## <state>topic = CLRJ | problem = CLRJ</state>
