package database.table;

import java.io.*;

public class TableFactory {
    public static Table create(String tableName, String[] columnNames) {
        return new ConcreteTable(tableName, columnNames);
    }

    public static Table load(String fileName, String location) throws IOException {
        Reader in = new FileReader(new File(new File(location), fileName));
        Table loaded = new ConcreteTable(new CSVImporter(in));
        in.close();
        return loaded;
    }
}
