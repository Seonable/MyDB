package database.table;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class TableFactory {
    public static Table create(String tableName, String[] columnNames) {
        return new ConcreteTable(tableName, columnNames);
    }
}
