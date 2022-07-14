import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class WithProblemsTests {

    private String CONST = "const";
    private final static String bd = "pui";

    //Переименование первого и третьего кейса
    @Test
    public void equalsOneToOneString(){
        assertEquals("1", "1");
    }

    //Убран final, т.к. в этом кейсе значение переменной меняется
    @Test
    public void assignValueToConstVar(){
        CONST = "newValue";
        assertEquals("newValue", CONST);
    }

    //Переименование первого и третьего кейса
    @Test
    public void equalsOneToOne(){
        assertEquals(1, 1);
    }

    @Test
    public void stringsMustBeEquals(){
        String res = "a";

        if (bd.equals("pui")) {
            res = "asd";
        }

        assertEquals("asd", res);
    }

    //Тест реализован согласно его названию, удаление первого элемента из списка
    @Test
    public void successfullyRemovingFirstElementFromList(){
        List<String> sourceData = new LinkedList<>(Arrays.asList("1", "viskas", "chupocabra"));
        sourceData.remove(0);
        assertFalse(sourceData.contains("1"));
    }
}
