import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TennisScoringKataTest {

    private TennisScoringKata kata;



    @BeforeEach
    public void setUp() {
        kata = new TennisScoringKata(player1, player2);
    }

    String player1 = "Fred";
    String player2 = "Perry";

    @Test
    public void testPlayersAreTiedAt15() {
        kata.points(player1);
        kata.points(player2);
        assertEquals("15-15", kata.getScore());
    }

    @Test
    public void testPlayer2GetsAdvantage() {
        kata.points(player1);
        kata.points(player1);
        kata.points(player1);
        kata.points(player2);
        kata.points(player2);
        kata.points(player2);
        kata.points(player2);
        assertEquals("Advantage " + player2, kata.getScore());
    }

    @Test
    public void testLoveLove() {
        assertEquals("Love-Love", kata.getScore());
    }

    @Test
    public void player1wins() {
        kata.points(player1);
        kata.points(player1);
        kata.points(player1);
        kata.points(player1);
        assertEquals( player1 + " wins", kata.getScore());
    }

}