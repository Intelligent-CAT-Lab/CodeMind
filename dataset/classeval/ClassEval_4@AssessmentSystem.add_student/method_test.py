def test(self):

        assessment_system = AssessmentSystem()
        assessment_system.add_student("Alice", 3, "Mathematics")
        return assessment_system.students['Alice']