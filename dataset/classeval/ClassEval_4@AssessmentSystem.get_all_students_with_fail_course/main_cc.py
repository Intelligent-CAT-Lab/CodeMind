
class AssessmentSystem: 
    def __init__(self):
        """
        Initialize the students dict in assessment system.
        """
        self.students = {}

    def get_all_students_with_fail_course(self):
        students = []
        for name, student in self.students.items():
            for course, score in student['courses'].items():
                if score < 60:
                    students.append(name)
                    break
        return students