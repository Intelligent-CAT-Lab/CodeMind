
class SQLGenerator: 
    def __init__(self, table_name):
        """
        Initialize the table name.
        :param table_name: str
        """
        self.table_name = table_name

    def delete(self, condition):
        sql = f"DELETE FROM {self.table_name} WHERE {condition}"
        return sql + ";"