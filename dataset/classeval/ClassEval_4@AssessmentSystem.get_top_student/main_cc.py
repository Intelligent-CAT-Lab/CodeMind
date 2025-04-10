
class AssessmentSystem: 
    def __init__(self):
        """
        Initialize the students dict in assessment system.
        """
        self.students = {}

    def get_top_student(self):
        top_student = None
        top_gpa = 0
        for name, student in self.students.items():
            gpa = self.get_gpa(name)
            if gpa is not None and gpa > top_gpa:
                top_gpa = gpa
                top_student = name
        return top_student
    def get_gpa(self, name):
        if name in self.students and self.students[name]['courses']:
            return sum(self.students[name]['courses'].values()) / len(self.students[name]['courses'])
        else:
            return None