package ru.job4j.stream;

import org.junit.Test;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ConvertMatrixToListTest {

    @Test
    public void transformation() {
        Integer[][] numbers = new Integer[][]{
                {1,2},
                {3,4}
        };
        ConvertMatrixToList convertMatrixToList = new ConvertMatrixToList();
        List<Integer> res = convertMatrixToList.transformation(numbers);
        List<Integer> exp = List.of(1, 2, 3, 4);
        assertThat(res, is(exp));
    }
}