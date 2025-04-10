import sqlite3
class StudentDatabaseProcessor: 
    def __init__(self, database_name):
        """
        Initializes the StudentDatabaseProcessor object with the specified database name.
        :param database_name: str, the name of the SQLite database.
        """
        self.database_name = database_name

    def search_student_by_name(self, name):
        conn = sqlite3.connect(self.database_name)
        cursor = conn.cursor()

        select_query = "SELECT * FROM students WHERE name = ?"
        cursor.execute(select_query, (name,))
        result = cursor.fetchall()

        conn.close()

        return result