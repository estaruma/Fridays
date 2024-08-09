import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class GameTest {
    private Game game;

    @BeforeEach
    void setUp() {
        List<Player> players = new ArrayList<>();
        players.add(new Player("Alice"));
        players.add(new Player("Bob"));
        game = new Game(players);
    }

    @Test
    void testGameInitialization() {
        assertNotNull(game);

    }
}