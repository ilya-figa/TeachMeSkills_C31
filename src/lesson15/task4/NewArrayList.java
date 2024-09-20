package lesson15.task4;

public class NewArrayList<T>{
    private int capacity;
    private T[] array;
    private int size;

    public NewArrayList() {
        newArrayList();
    }

    public void add(T object) {
        if (size == capacity) {
            array = rewriteArray();
        }
        array[size++] = object;
    }

    public void remove() {
        array[size--] = null;
    }

    public Object get(int index) {
        return array[index];
    }

    public boolean contains(T object) {
        for (int i = 0; i < size; i++) {
            if(array[i] != null && array[i].equals(object)){
                return true;
            }
        }
        return false;
    }

    public void clear(){
        newArrayList();
    }

    private void newArrayList(){
        capacity = 10;
        array = (T[])(new Object[capacity]);;
        size = 0;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i].toString());
        }
    }

    private T[] rewriteArray() {
        newCapacity();
        T[] objects = (T[])(new Object[capacity]);
        if (size >= 0) {
            System.arraycopy(array, 0, objects, 0, size);
        }
        return objects;
    }

    private void newCapacity() {
        capacity = (capacity * 3) / 2 + 1;
    }
}
