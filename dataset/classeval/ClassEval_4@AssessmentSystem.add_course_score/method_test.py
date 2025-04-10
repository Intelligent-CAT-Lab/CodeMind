def test(self):

        assessment_system = AssessmentSystem()
        assessment_system.students = {"Alice": {'name': 'Alice', 'grade': 3, 'major': 'Mathematics', 'courses': {}}}
        assessment_system.add_course_score("Alice", "Math", 90)
        return assessment_system.students['Alice']['courses']['Math']