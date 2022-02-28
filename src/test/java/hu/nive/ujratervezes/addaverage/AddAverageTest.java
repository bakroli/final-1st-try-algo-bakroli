package hu.nive.ujratervezes.addaverage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
| `numbers`             | `n`  | Eredmény                            |
| :-------------------- | :--: | :---------------------------------- |
| `[-2, -1, 0, 1, 2]`   | `2`  | `[-2, 0, 0, 0, 2]`                  |
| `[3, 1, 5, 3, 4]`     | `1`  | `[9, 3, 15, 9, 12]`                   |
| `[2, 12]`             | `2`  | `[2, 84]`                           |
| `[]`                  | `1`  | `[]`                                |
| `null`                | `1`  | `IllegalArgumentException`          |
| `[2, 12]`             | `0`  | `IllegalArgumentException`          |
| `[2, 12]`             | `-1` | `IllegalArgumentException`          |
*/

class AddAverageTest {

    @Test
    void testAddAverage_validInput() {
        Assertions.assertArrayEquals(new int[]{-2, 0, 0, 0, 2}, new AddAverage().addAverage(new int[]{-2, -1, 0, 1, 2}, 2));
    }

    @Test
    void testAddAverage_validInput1() {
        Assertions.assertArrayEquals(new int[]{9, 3, 15, 9, 12}, new AddAverage().addAverage(new int[]{3, 1, 5, 3, 4}, 1));
    }

    @Test
    void testAddAverage_validInput2() {
        Assertions.assertArrayEquals(new int[]{2, 84}, new AddAverage().addAverage(new int[]{2, 12}, 2));
    }

    @Test
    void testAddAverage_emptyArray() {
        Assertions.assertArrayEquals(new int[]{}, new AddAverage().addAverage(new int[]{}, 1));
    }

    @Test
    void testAddAverage_throwsIllegalArgumentExceptionForNullParameter() {
        AddAverage addAverage = new AddAverage();
        Assertions.assertThrows(IllegalArgumentException.class, () -> addAverage.addAverage(null, 1));
    }

    @Test
    void testAddAverage_throwsIllegalArgumentExceptionForZero() {
        AddAverage addAverage = new AddAverage();
        Assertions.assertThrows(IllegalArgumentException.class, () -> addAverage.addAverage(new int[]{2, 12}, 0));
    }

    @Test
    void testAddAverage_throwsIllegalArgumentExceptionForNegative() {
        AddAverage addAverage = new AddAverage();
        Assertions.assertThrows(IllegalArgumentException.class, () -> addAverage.addAverage(new int[]{2, 12}, -1));
    }

}