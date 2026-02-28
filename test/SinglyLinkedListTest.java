import org.junit.jupiter.api.Test;
import list.SinglyLinkedList;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    @Test
    void testAddAndRemove() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        list.addFirst(10);
        list.addFirst(20);

        assertEquals(20, list.removeFirst());
        assertEquals(10, list.removeFirst());
    }

    @Test
    void testIsEmpty() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        assertTrue(list.isEmpty());
    }
}