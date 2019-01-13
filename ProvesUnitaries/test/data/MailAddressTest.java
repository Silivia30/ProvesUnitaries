package data;

import org.junit.*;

import static org.junit.Assert.assertEquals;


public class MailAddressTest {

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


}
