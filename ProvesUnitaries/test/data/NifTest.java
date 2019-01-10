package data;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class NifTest {

    @BeforeClass
    public static void setupAll(){

    }

    @Before
    public void setup(){

    }

    @Test (expected = Exception.class)
    public void testNullException() throws Exception{
        Nif nullExample = new Nif("");
    }

    @Test
    public void testValidNif() throws Exception {
        Nif validNif = new Nif("47980090C");
        assertEquals("47980090C", validNif.getNIF());
    }

    @Test (expected = Exception.class)
    public void testInvalidNifLower() throws Exception{
        Nif invalidExample = new Nif("123123123C");
    }

    @Test (expected = Exception.class)
    public void testInvalidNifUpper() throws Exception{
        Nif invalidExample = new Nif("123123C");
    }

    @Test (expected = Exception.class)
    public void testInvalidNifUnordered() throws Exception{
        Nif invalidExample = new Nif("C12312312");
    }

    @After
    public void teardown(){

    }

    @AfterClass
    public static void teardownAll(){

    }

}
