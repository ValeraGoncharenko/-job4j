package ru.job4j.lambda;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FunctionCountingTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        FunctionCounting function = new FunctionCounting();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void quadraticFunction() {
        FunctionCounting function = new FunctionCounting();
        List<Double> result = function.diapason(5, 8, x -> 3 * Math.pow(x, 2) + 2 * x);
        List<Double> expected = Arrays.asList(85D, 120D, 161D);
        assertThat(result, is(expected));
    }


    @Test
    public void exponentialFunction() {
        FunctionCounting function = new FunctionCounting();
        List<Double> result = function.diapason(2, 4, x -> Math.pow(4, x));
        List<Double> expected = Arrays.asList(16D, 64D);
        assertThat(result, is(expected));
    }
}