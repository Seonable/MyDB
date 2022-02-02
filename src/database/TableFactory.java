package database;

public class TableFactory {

    public static Table createTable(String tableName, String[] columns) {
        return new ConcreteTable(tableName, columns);
    }
}
