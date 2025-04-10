def test(self):
        self.db_name = "test.db"
        self.db = BookManagementDB(self.db_name)
        self.connection = sqlite3.connect(self.db_name)
        self.cursor = self.connection.cursor()
        # Check if the table exists
        self.cursor.execute("SELECT name FROM sqlite_master WHERE type='table' AND name='books'")
        result = self.cursor.fetchone()
        return result