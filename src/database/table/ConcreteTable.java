package database.table;

public class ConcreteTable implements Table {

    private String tableName;
    private String[] columnNames;

    public ConcreteTable(String tableName, String[] columnNames) {
        this.tableName = tableName;
        this.columnNames = columnNames.clone();
    }
}
