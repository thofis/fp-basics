package fpbasicsjava;

import org.junit.Before;
import org.junit.Test;

import java.util.function.IntPredicate;

import static org.junit.Assert.*;

class FirstClassCitizens {

    // assigning values to variables
    int number = 42;
    Object object = new Object();

    // a function / lambda can be assigned to a variable
    IntPredicate isEven = i -> i % 2 == 0;


    // a function can be used as argument and or return value of
    // another function (higher order function)
    IntPredicate negate(IntPredicate predicate) {
        return i -> !predicate.test(i);
    }

    // java supports method reference as an additional language construct
    boolean isEven(int number) {
        return number % 2 == 0;
    }

    // btw. Predicate supports negation as a default method
    IntPredicate isOdd = isEven.negate();

    // long form of lambda expression using curly braces and return statement
    IntPredicate isEven2 = i -> {
        return i % 2 == 0;
    };

    // pre Java 8 - as anonymous inner class
    IntPredicate isEven3 = new IntPredicate() {
        @Override
        public boolean test(int value) {
            return value % 2 == 0;
        }
    };
}

public class FirstClassCitizensTest {

    private FirstClassCitizens fcc;

    @Before
    public void setup() {
        fcc = new FirstClassCitizens();
    }

    @Test
    public void lambdaAsFirstClassCitizen() {
        assertTrue(fcc.isEven.test(0));
        assertTrue(fcc.isEven.test(1));

        IntPredicate isOdd = fcc.negate(fcc.isEven);

        assertFalse(isOdd.test(0));
        assertFalse(isOdd.test(1));
    }

    @Test
    public void usingMethodReference() {
        IntPredicate isOdd = fcc.negate(fcc::isEven);
        assertFalse(isOdd.test(2));
    }
}


