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
        self.db.insert_user('user2', 'pass2')
        self.db.delete_user_by_username('user2')
        user = self.db.search_user_by_username('user2')
        return user