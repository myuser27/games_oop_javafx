package ru.job4j.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class BishopBlackTest {
    @Test
    public void positionTest() {
        BishopBlack bb = new BishopBlack(Cell.A1);
        assertThat(Cell.A1, is(bb.position()));
    }

    @Test
    public void copyTest() {
        BishopBlack bb = new BishopBlack(Cell.A1);
        assertThat(bb.copy(Cell.A2).position(), is(Cell.A2));
    }

    @Test
    public void wayTest() {
        BishopBlack bb = new BishopBlack(Cell.C1);
        Cell[] bbway = bb.way(Cell.C1, Cell.G5);
        Cell[] excpect = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(bbway, is(excpect));
    }

    @Test
    public void idDiagonalTrueTest() {
        BishopBlack bb = new BishopBlack(Cell.C1);
        boolean diag = bb.isDiagonal(Cell.F6, Cell.B2);
        assertThat(diag, is(true));
    }

    @Test
    public void idDiagonalFalseTest() {
        BishopBlack bb = new BishopBlack(Cell.C1);
        boolean diag = bb.isDiagonal(Cell.F6, Cell.B1);
        assertThat(diag, is(false));
    }
}
