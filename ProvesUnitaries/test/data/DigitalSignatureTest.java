package data;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class DigitalSignatureTest {

    @BeforeClass
    public static void setupAll(){

    }

    @Before
    public void setup(){

    }

    @Test (expected = Exception.class)
    public void testNullException() throws Exception{
        DigitalSignature nullExample = new DigitalSignature(null);
    }

    @Test
    public void testNotNull() throws Exception {
        DigitalSignature notNullExample = new DigitalSignature(new byte[10]);
        assertNotNull(notNullExample);
    }
    @Test
    public void testCorrectKeyPrint() throws Exception {

        byte[] bytes = new byte[10];
        DigitalSignature printExample = new DigitalSignature(bytes);

        assertEquals(bytes, printExample.getDigitalSignature());
    }

    @After
    public void teardown(){

    }

    @AfterClass
    public static void teardownAll(){

    }


}
