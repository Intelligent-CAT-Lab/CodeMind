import sqlite3
class UserLoginDB: 
    def __init__(self, db_name):
        """
        Initializes the UserLoginDB object with the specified database name.
        :param db_name: str, the name of the SQLite database.
        """
        self.connection = sqlite3.connect(db_name)
        self.cursor = self.connection.cursor()

    def validate_user_login(self, username, password):
        user = self.search_user_by_username(username)
        if user is not None and user[1] == password:
            return True
        return False
    def search_user_by_username(self, username):
        self.cursor.execute('''
            SELECT * FROM users WHERE username = ?
        ''', (username,))
        user = self.cursor.fetchone()
        return user