import database.Table;
import database.TableFactory;
import org.junit.jupiter.api.Test;

public class DBInsertTest {

    @Test
    public void testCreateTable() {
        Table people = TableFactory.createTable("PEOPLE", new String[] { "last", "first", "addrId" } );
    }

    @Test
    public void testInsert() {

    }
}
