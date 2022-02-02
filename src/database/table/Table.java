package database.table;

import java.io.IOException;
import java.util.Iterator;

public interface Table {


    public interface Importer {

        void startTable() throws IOException;

        String loadTableName();

        Iterator loadColumnNames();

        int loadWidth();

        void endTable();
    }
}
