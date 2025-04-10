import sqlite3
class BookManagementDB: 
    def __init__(self, db_name):
        """
        Initializes the class by creating a database connection and cursor, 
        and creates the book table if it does not already exist
        :param db_name: str, the name of db file
        """
        self.connection = sqlite3.connect(db_name)
        self.cursor = self.connection.cursor()
        self.create_table()

    def create_table(self):
        self.cursor.execute('''
            CREATE TABLE IF NOT EXISTS books (
                id INTEGER PRIMARY KEY,
                title TEXT,
                author TEXT,
                available INTEGER
            )
        ''')
        self.connection.commit()