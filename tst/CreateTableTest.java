import database.table.Table;
import database.table.TableFactory;
import org.junit.jupiter.api.Test;

public class CreateTableTest {

    @Test
    public void testCreateTable() {
        Table people = TableFactory.createTable("PEOPLE", new String[] { "last", "first", "addrId" } );
    }

}
