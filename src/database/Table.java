package database;

public class Table {

    private final String tableName;
    private final String[] columns;

    public Table(String tableName, String[] columns) {
        this.tableName = tableName;
        this.columns = columns.clone();
    }
}
