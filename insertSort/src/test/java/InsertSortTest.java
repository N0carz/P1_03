import com.sda.exercises.InsertSort;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertSortTest {

    @Test
    public void sortTest() {
        InsertSort insertSort = new InsertSort();
        List<Integer> unsortedList = new ArrayList<>(Arrays.asList(9, 7, 5, 8, 6, 2, 4, 3, 1));

        //when
        List<Integer> returned = insertSort.sort(unsortedList);
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        //then
        Assert.assertEquals(returned, expected);
    }

    @Test
    public void sortEmptyListTest() {
        InsertSort bubbleSort = new InsertSort();
        List<Integer> unsortedList = new ArrayList<>();

        //when
        List<Integer> returned = bubbleSort.sort(unsortedList);
        List<Integer> expected = new ArrayList<>();

        //then
        Assert.assertEquals(returned, expected);
    }
}
