package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenPoints20And40Then2() {
        Point a = new Point(2, 0);
        Point b = new Point(4, 0);
        double result = a.distance(b);
        double expected = 2;
        assertThat(result).isEqualTo(expected, withPrecision(0.001));
    }

    @Test
    void whenPoints20And40Then3() {
        Point a = new Point(2, 2);
        Point b = new Point(2, 2);
        double result = a.distance(b);
        double expected = 0;
        assertThat(result).isEqualTo(expected, withPrecision(0.001));
    }

}