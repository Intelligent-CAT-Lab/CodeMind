
class AssessmentSystem: 
    def __init__(self):
        """
        Initialize the students dict in assessment system.
        """
        self.students = {}

    def get_course_average(self, course):
        total = 0
        count = 0
        for student in self.students.values():
            if course in student['courses']:
                score = student['courses'][course]
                if score is not None:
                    total += score
                    count += 1
        return total / count if count > 0 else None