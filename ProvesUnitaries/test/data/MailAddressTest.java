package data;

import org.junit.*;

import static org.junit.Assert.assertEquals;


public class MailAddressTest {

    @BeforeClass
    public static void setupAll(){

    }

    @Before
    public void setup(){

    }

    @Test (expected = Exception.class)
    public void testNullException() throws Exception{
        MailAddress nullExample = new MailAddress("");
    }

    @Test
    public void testNotNull() throws Exception {
        MailAddress notNullExample = new MailAddress("test@test.com");
        assertEquals("test@test.com", notNullExample.getMailAdress());
    }

    @Test (expected = Exception.class)
    public void testIncorrectMail() throws Exception {
//    TODO: create custom exception InvalidMailException
        MailAddress incorrectMail = new MailAddress("incorrect.@@.mail.com");
    }

    @After
    public void teardown(){

    }

    @AfterClass
    public static void teardownAll(){

    }

}
