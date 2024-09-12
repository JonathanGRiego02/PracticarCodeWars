package problemas.pruebasuma;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class TestAdd {

    @Test
    public void shouldAnswerWithTrue() {
        assertEquals(3, Add.add(2, 1));
    }
}
