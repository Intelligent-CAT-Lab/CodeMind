def numerical_letter_grade(grades):

   
    letter_grade = []	## letter_grade = CLRJ
    for gpa in grades:	## gpa = CLRJ|grades = CLRJ
        if gpa == 4.0:	## gpa = CLRJ
            letter_grade.append("A+")	## letter_grade = CLRJ
        elif gpa > 3.7:	## gpa = CLRJ
            letter_grade.append("A")
        elif gpa > 3.3:	## gpa = CLRJ
            letter_grade.append("A-")	## letter_grade = CLRJ
        elif gpa > 3.0:	## gpa = CLRJ
            letter_grade.append("B+")
        elif gpa > 2.7:	## gpa = CLRJ
            letter_grade.append("B")	## letter_grade = CLRJ
        elif gpa > 2.3:	## gpa = CLRJ
            letter_grade.append("B-")
        elif gpa > 2.0:	## gpa = CLRJ
            letter_grade.append("C+")
        elif gpa > 1.7:	## gpa = CLRJ
            letter_grade.append("C")	## letter_grade = CLRJ
        elif gpa > 1.3:	## gpa = CLRJ
            letter_grade.append("C-")	## letter_grade = CLRJ
        elif gpa > 1.0:
            letter_grade.append("D+")
        elif gpa > 0.7:
            letter_grade.append("D")
        elif gpa > 0.0:
            letter_grade.append("D-")
        else:
            letter_grade.append("E")
    return letter_grade	## letter_grade = CLRJ
