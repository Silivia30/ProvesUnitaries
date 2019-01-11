package kiosk;

import data.Party;
import org.junit.*;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;


public class VoteCounterTest {
    private VoteCounter example;
    private Party test;

    @BeforeClass
    public static void setupAll(){

    }

    @Before
    public void setup(){
        Set<Party> parties = new HashSet<>();
        this.test = new Party("test");
        parties.add(test);

        this.example = new VoteCounter(parties);
    }

    @Test (expected = Exception.class)
    public void testNullVoteCounter() throws Exception{
        VoteCounter nullExample = new VoteCounter(null);
    }

    @Test
    public void testCountNull() {
        example.countNull();

        assertEquals(1, example.getNulls());
    }

    @Test
    public void testCountBlank() {
        example.countBlank();

        assertEquals(1, example.getBlanks());
    }

    @Test
    public void testScrutinizeNull() {
        example.scrutinize(new Party("null"));

        assertEquals(1, example.getNulls());
    }

    @Test
    public void testScrutinizeBlank() {
        example.scrutinize(new Party(""));

        assertEquals(1, example.getBlanks());
    }

    @Test
    public void testScrutinizeParty() {
        example.scrutinize(test);

        assertEquals(1, example.getVotesFor(test));
    }

    @Test
    public void testGetTotal() {
        example.scrutinize(test);
        example.scrutinize(new Party(""));
        example.scrutinize(new Party("null"));


        assertEquals(3, example.getTotal());
    }

    @After
    public void teardown(){

    }

    @AfterClass
    public static void teardownAll(){

    }

}
