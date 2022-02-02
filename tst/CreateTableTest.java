import database.table.Table;
import database.table.TableFactory;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class CreateTableTest {

    @Test
    public void testCreateTableByObject() {
        Table people = TableFactory.create("PEOPLE", new String[] { "last", "first", "addrId" } );
        System.out.println(people.toString());
    }

//    @Test
//    public void testCreateTableByFile() throws IOException {
//        Table people = TableFactory.load("people", ".");
//        System.out.println(people.toString());
//    }

}
