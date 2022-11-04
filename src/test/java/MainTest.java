import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;

class MainTest {

    Main sut = new Main();

    @Mock
    Main sutMock = Mockito.mock(Main.class);

    @Test
    void addiere() {
        int summe = sut.addiere(1, 2);
        assertEquals(summe, 3);
    }

    @Test
    void mockitoTest() {
        doReturn(4).when(sutMock).addiere(1, 2);

        int addiere = sutMock.addiere(1, 2);

        assertEquals(4, addiere);
    }


}