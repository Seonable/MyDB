package database;

public class TableFactory {

    public static Table createTable(String people, String[] columns) {
        return new Table(people, columns);
    }
}
