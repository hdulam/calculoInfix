import org.junit.jupiter.api.Test;
import list.DoublyLinkedList;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    @Test
    void testAddRemove() {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();

        list.addFirst("A");
        list.addFirst("B");

        assertEquals("B", list.removeFirst());
    }
}