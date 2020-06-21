package ru.job4j.collection;

import org.junit.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.SortByNameItem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class JobTest {

    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new SortByNameJob().thenComparing(new SortByPriorityJob());
        int rsl = cmpNamePriority.compare(
                new Job("B", 1),
                new Job("A", 2)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorByNameAndProrityDesc() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameAndProrityIsEqualTo() {
        Comparator<Job> cmpNamePriority = new SortByNameJob().thenComparing(new SortByPriorityJob());
        int rsl = cmpNamePriority.compare(
                new Job("B", 2),
                new Job("B", 2)
        );
        assertThat(rsl, equalTo(0));
    }

}