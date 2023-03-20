package org.learning;

public class DynamicArrayDS {
    public static void call() {
        DynamicArray dynamicArray = new DynamicArray();
        // DynamicArray dynamicArray = new DynamicArray(100); // capacity = 100

        System.out.println(dynamicArray.capacity); // = 5 (default)

        System.out.println(dynamicArray); // = []
        System.out.println(dynamicArray.isEmpty()); // = true

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");

        // System.out.println(dynamicArray.isEmpty()); = false

        System.out.println(dynamicArray); // = [A, B, C]
        System.out.println(dynamicArray.size); // = 3
        System.out.println(dynamicArray.capacity); // = 10

        dynamicArray.insert(0, "X");

        System.out.println(dynamicArray); // = [X, A, B, C]

        dynamicArray.delete("A");

        System.out.println(dynamicArray); // = [X, B, C]

        System.out.println(dynamicArray.search("C")); // index = 2

        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F"); // size > original capacity -> array grow

        System.out.println(dynamicArray); // = [X, B, C, D, E, F]
        System.out.println(dynamicArray.size); // = 6
        System.out.println(dynamicArray.capacity); // = 10

        dynamicArray.delete("X");
        dynamicArray.delete("B");
        dynamicArray.delete("C");
        dynamicArray.delete("D"); // size <= capacity / 3 -> array shrink

        System.out.println(dynamicArray); // = [E, F]
        System.out.println(dynamicArray.size); // = 2
        System.out.println(dynamicArray.capacity); // = 5
    }

    private static class DynamicArray {
        int size;
        int capacity = 5;

        Object[] array;

        public DynamicArray() {
            this.array = new Object[capacity];
        }

        public DynamicArray(int capacity) {
            this.capacity = capacity;
            this.array = new Object[capacity];
        }

        public void add(Object data) {
            if (size >= capacity) {
                grow();
            }

            array[size] = data;
            size++;
        }

        public void insert(int index, Object data) {
            if (size >= capacity) {
                grow();
            }

            for (int i = size; i > index; i--) {
                array[i] = array[i - 1];
            }

            array[index] = data;
            size++;
        }

        public void delete(Object data) {
            for (int i = 0; i < size; i++) {
                if(array[i] == data) {
                    for (int j = 0; j < (size - i -1); j++) {
                        array[i + j] = array[i + j + 1];
                    }

                    array[size - 1] = null;
                    size--;

                    if (size <= (capacity/3)) {
                        shrink();
                    }

                    break;
                }
            }
        }

        public int search(Object data) {
            for (int i = 0; i < size; i++) {
                if (array[i] == data) {
                    return i;
                }
            }

            return -1;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public String toString() {
            String string = "";

            for (int i = 0; i < size; i++) {
                string += array[i] + ", ";
            }

            if (!string.equals("")) {
                string = "[" + string.substring(0, string.length() - 2) + "]";
            } else {
                string = "[]";
            }

            return string;
        }

        private void grow() {
            int newCapacity = capacity * 2;
            Object[] newArray = new Object[newCapacity];

            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }

            capacity = newCapacity;
            array = newArray;
        }

        private void shrink() {
            int newCapacity = capacity / 2;
            Object[] newArray = new Object[newCapacity];

            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }

            capacity = newCapacity;
            array = newArray;
        }
    }
}
