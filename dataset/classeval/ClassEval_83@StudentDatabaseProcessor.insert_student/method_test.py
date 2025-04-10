def test(self):
        self.processor = StudentDatabaseProcessor("test_database.db")
        self.processor.create_student_table()
        student_data = {
            'name': 'Bob',
            'age': 19,
            'gender': 'male',
            'grade': 85
        }
        self.processor.insert_student(student_data)

        result = self.processor.search_student_by_name('Bob')

        return len(result),result[0][1]