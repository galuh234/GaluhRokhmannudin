package Chapter10_ObjectOrientedThinking.latihan;

public class listing10_8_sTACKoFiNTEGERS {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    public listing10_8_sTACKoFiNTEGERS() {
        this(DEFAULT_CAPACITY);
    }

    public listing10_8_sTACKoFiNTEGERS(int capacity) {
        elements = new int[capacity];
    }

    public void push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }
    public int pop() {
        return elements[--size];
    }
    public int peek() {
        return elements[size - 1];
    }
    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
