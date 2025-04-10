
class SQLGenerator: 
    def __init__(self, table_name):
        """
        Initialize the table name.
        :param table_name: str
        """
        self.table_name = table_name

    def insert(self, data):
        fields = ", ".join(data.keys())
        values = ", ".join([f"'{value}'" for value in data.values()])
        sql = f"INSERT INTO {self.table_name} ({fields}) VALUES ({values})"
        return sql + ";"