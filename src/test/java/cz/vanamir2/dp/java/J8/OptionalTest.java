package cz.vanamir2.dp.java.J8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class OptionalTest {

    @Test
    void testOptionalWithValue() {
        Optional<Double> optional = Optional.of(Double.valueOf(42));
        Assertions.assertFalse(optional.isEmpty());
        Assertions.assertEquals(optional.get(), Double.valueOf(42));
    }

    @Test
    void testOptionalWithoutValue() {
        Optional<Double> optional = Optional.empty();
        Assertions.assertTrue(optional.isEmpty());
        Assertions.assertEquals(optional.orElseGet(() -> Double.MAX_VALUE), Double.MAX_VALUE);
    }


}
