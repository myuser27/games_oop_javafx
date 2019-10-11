package ru.job4j.firuges;

import org.junit.Test;
import ru.job4j.chess.Logic;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class LogicTest {
    @Test
    public void whereMoveTest() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new BishopBlack(Cell.E7));
        boolean result = logic.move(Cell.C1, Cell.G5);
        assertThat(result, is(true));
    }

    @Test
    public void whereNotMoveTest() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new BishopBlack(Cell.E3));
        boolean result = logic.move(Cell.C1, Cell.G5);
        assertThat(result, is(false));
    }
}
