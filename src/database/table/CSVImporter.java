package database.table;

import tools.ArrayIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

public class CSVImporter implements Table.Importer {
    private BufferedReader in;

    private String tableName;
    private String[] columnNames;

    public CSVImporter(Reader in) {
        this.in = in instanceof BufferedReader ?
                (BufferedReader) in :
                new BufferedReader(in)
                ;
    }

    @Override
    public void startTable() throws IOException {
        tableName = in.readLine().trim();
        columnNames = in.readLine().split("\\s*,\\s*");
    }

    @Override
    public String loadTableName() {
        return tableName;
    }

    @Override
    public Iterator loadColumnNames() {
        return new ArrayIterator(columnNames);
    }

    @Override
    public int loadWidth() {
        return columnNames.length;
    }

    @Override
    public void endTable() {

    }
}
