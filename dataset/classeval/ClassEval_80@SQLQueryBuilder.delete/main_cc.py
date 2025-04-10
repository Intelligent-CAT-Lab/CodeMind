
class SQLQueryBuilder: 
    @staticmethod
    def delete(table, where=None):
        query = f"DELETE FROM {table}"
        if where:
            query += " WHERE " + ' AND '.join(f"{k}='{v}'" for k, v in where.items())
        return query