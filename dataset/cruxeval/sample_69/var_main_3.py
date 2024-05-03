def f(student_marks, name):
    if name in student_marks:	## <state>name = CLRJ | student_marks = CLRJ</state>
        value = student_marks.pop(name)
        return value
    return 'Name unknown'