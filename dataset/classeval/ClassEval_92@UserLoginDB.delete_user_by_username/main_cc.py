import sqlite3
class UserLoginDB: 
    def __init__(self, db_name):
        """
        Initializes the UserLoginDB object with the specified database name.
        :param db_name: str, the name of the SQLite database.
        """
        self.connection = sqlite3.connect(db_name)
        self.cursor = self.connection.cursor()

    def delete_user_by_username(self, username):
        self.cursor.execute('''
            DELETE FROM users WHERE username = ?
        ''', (username,))
        self.connection.commit()