import database.Table;
import database.TableFactory;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class CreateTableTest {

    @Test
    public void testCreateTable() {
        Table people = TableFactory.createTable("PEOPLE", new String[] { "last", "first", "addrId" } );
    }

}
