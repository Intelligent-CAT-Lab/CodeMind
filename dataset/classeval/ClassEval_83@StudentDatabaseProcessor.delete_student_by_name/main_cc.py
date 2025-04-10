import sqlite3
class StudentDatabaseProcessor: 
    def __init__(self, database_name):
        """
        Initializes the StudentDatabaseProcessor object with the specified database name.
        :param database_name: str, the name of the SQLite database.
        """
        self.database_name = database_name

    def delete_student_by_name(self, name):
        conn = sqlite3.connect(self.database_name)
        cursor = conn.cursor()

        delete_query = "DELETE FROM students WHERE name = ?"
        cursor.execute(delete_query, (name,))

        conn.commit()
        conn.close()