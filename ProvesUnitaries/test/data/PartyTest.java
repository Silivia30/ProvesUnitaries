package data;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class PartyTest {

    @BeforeClass
    public static void setupAll(){

    }

    @Before
    public void setup(){

    }

    @Test
    public void testNullParty() throws Exception{
        String expected = "";
        Party nullParty = new Party(null);
        assertEquals(expected, nullParty.getName());
    }

    @Test
    public void testPartyName() throws Exception {
        String expected = "Example Party";
        Party partyExample = new Party("Example Party");
        assertEquals(expected, partyExample.getName());
    }

    @Test
    public void testPartyEmptyName() throws Exception{
        String expected = "";
        Party partyEmptyName = new Party("");
        assertEquals(expected, partyEmptyName.getName());
    }

    @After
    public void teardown(){

    }

    @AfterClass
    public static void teardownAll(){

    }

}
