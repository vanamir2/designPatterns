package cz.vanamir2.dp.java.J8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FunctionalInterfaceTest {

    @Test
    void useFunctionalInterfaceWithOverride() {
        String str = "Using functional interface with override (anonymous class).";
        FunctionalInterface functionalInterface = new FunctionalInterface() {
            @Override
            public String run() {
                return str;
            }
        };
        assertEquals(str, functionalInterface.run());
    }

    @Test
    void useFunctionalInterfaceWithLambdaStatement() {
        String str = "Using functional interface with lambda.";
        FunctionalInterface functionalInterface = () -> {
            return str;
        };
        assertEquals(str, functionalInterface.run());
    }

    @Test
    void useFunctionalInterfaceWithLambdaExpression() {
        String str = "Using functional interface with lambda.";
        FunctionalInterface functionalInterface = () -> str;
        assertEquals(str, functionalInterface.run());
    }

}
