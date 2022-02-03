import static org.junit.Assert.*;
import org.junit.*;
public class AdditionClassTest {
    // need to think of tests and import junit libraries
    @Test
    public void testAdd() {
        assertEquals(5, AdditionClass.add(1,3));
        // This test should fail because 5 != 4
    }
    // 1 test 1 failure
    // time to push
}
