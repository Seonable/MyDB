package database.table;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

public class ConcreteTable implements Table {

    private String tableName;
    private String[] columnNames;

    public ConcreteTable(String tableName, String[] columnNames) {
        this.tableName = tableName;
        this.columnNames = columnNames.clone();
    }

    public ConcreteTable(Importer importer) throws IOException {
        importer.startTable();

        tableName = importer.loadTableName();
        int width = importer.loadWidth();
        Iterator columns = importer.loadColumnNames();

        columnNames = new String[width];
        for (int i = 0; columns.hasNext(); ) {
            columnNames[i++] = (String) columns.next();
        }

        // 파일에서 칼럼값 넣는 로직 추가해야 함

        importer.endTable();
    }

    @Override
    public String toString() {
        return "ConcreteTable{" +
                "tableName='" + tableName + '\'' +
                ", columnNames=" + Arrays.toString(columnNames) +
                '}';
    }
}
