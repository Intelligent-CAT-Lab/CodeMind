
class AssessmentSystem: 
    def __init__(self):
        """
        Initialize the students dict in assessment system.
        """
        self.students = {}

    def add_student(self, name, grade, major):
        self.students[name] = {'name': name, 'grade': grade, 'major': major, 'courses': {}}