import unittest
import sqlite3


class UserLoginDB:
    def __init__(self, db_name):
        self.connection = sqlite3.connect(db_name)
        self.cursor = self.connection.cursor()

    def insert_user(self, username, password):
        self.cursor.execute('''
            INSERT INTO users (username, password)
            VALUES (?, ?)
        ''', (username, password))
        self.connection.commit()

    def search_user_by_username(self, username):
        self.cursor.execute('''
            SELECT * FROM users WHERE username = ?
        ''', (username,))
        user = self.cursor.fetchone()
        return user

    def delete_user_by_username(self, username):
        self.cursor.execute('''
            DELETE FROM users WHERE username = ?
        ''', (username,))
        self.connection.commit()

    def validate_user_login(self, username, password):
        user = self.search_user_by_username(username)
        if user is not None and user[1] == password:
            return True
        return False
class Test(unittest.TestCase):
    def test(self):
            self.db_path = os.path.join(gettempdir(), 'test_db.db')
            conn = sqlite3.connect(self.db_path)
            cursor = conn.cursor()
            create_table_query = """
                    CREATE TABLE IF NOT EXISTS users (
                        username TEXT,
                        password TEXT
                    )
                    """
            cursor.execute(create_table_query)
            conn.commit()
            conn.close()
            self.db = UserLoginDB(self.db_path)
            self.db.insert_user('user5', 'pass5')
            user = self.db.search_user_by_username('user5')
            return user,user[0],user[1]