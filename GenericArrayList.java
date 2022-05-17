
public class GenericArrayList <T>{
/*    private T[] data;
    private int size;

    private void resizeData(int newSize) {
        T[] temp = (T[]) new Object[newSize];
        System.arraycopy(data, 0, temp, 0, Math.min(data.length, newSize));
        data = temp;
        size = newSize;

        }

    public GenericArrayList(int initialCapacity) {
        T[] data = (T[]) new Object[initialCapacity];
        this.data = data;
        size = initialCapacity;
    }

    public void add(T str) {
        int ind = 0;
        int sizes = data.length;
        if (contains2(data) == false) {
            resizeData(sizes+1);
        }
        for (T each: data) {
            
            if (each == null) {
                data[ind] = str;
                break;
            }
            ind++;
        }
    }

    public boolean contains2(Object[] dat) {
        for (Object each: dat) {
            if (each == null) {
                return true;
            }
        }
        return false;
    }

    public void add(int index, Object str) {
        int size = data.length;
        resizeData(size+1);
        T temp = data[index];
        if (index < data.length) {
            for (int i=index; i < data.length-1; i++) {
                T temp2 = data[i+1];
                data[i+1] = temp;
                temp = temp2;
        }
    }
    }

    public T get(int index) {
        return data[index];
    }

    public void remove(int index) {
        if (index >= 0 && index < data.length) {
            for (int i = index; i < data.length-1; i++) {
                data[i] = data[i+1];
            }
            data[data.length-1] = null;
        }
        resizeData(data.length-1);
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        /* PART 1:
         * Modify the GenericArrayList above so that it can store *any* class,
         * not just strings.
         * When you've done that, uncomment the block of code below, and see if
         * it compiles. If it does, run it. If there are no errors, you did
         * it right!
         

        //Uncomment me when you're done
        GenericArrayList<Point> pointList = new GenericArrayList<Point>(2);

        pointList.add(new Point(0, 0));
        pointList.add(new Point(2, 2));
        pointList.add(new Point(7, 0));
        pointList.add(new Point(19.16f, 22.32f));

        pointList.remove(0);
        Point p = pointList.get(2);

        if (p.x != 19.16f && p.y != 22.32f) {
            throw new AssertionError("Your GenericArrayList compiled properly "
            + "but is not correctly storing things. Make sure you didn't "
            + "accidentally change any of your ArrayStringList code, aside "
            + "from changing types.");
        }

        GenericArrayList<Float> floatList = new GenericArrayList<Float>(2);

        for (float f = 0.0f; f < 100.0f; f += 4.3f) {
            floatList.add(f);
        }

        float f = floatList.get(19);

        System.out.println("Hurray, everything worked!");
    */
    
}

