def test(self):

        classroom = Classroom(1)
        existing_course = {'name': 'math', 'start_time': '09:00', 'end_time': '10:00'}
        classroom.add_course(existing_course)
        new_course = {'name': 'SE', 'start_time': '14:30', 'end_time': '15:30'}
        result = classroom.check_course_conflict(new_course)
        return result