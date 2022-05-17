/*
public class GenericArrayListPt2 <T>{
    private T[] data;
    private int size;

    private void resizeData(int newSize) {
        T[] temp = (T[]) new Object[newSize];
        System.arraycopy(data, 0, temp, 0, Math.min(data.length, newSize));
        data = temp;
        size = newSize;

        }

    public GenericArrayListPt2(int initialCapacity) {
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
       

        /* PART 2:
         * Now, modify your GenericArrayList again so that it can only store
         * things that are comparable to a Point.
         *
         * If you don't know how to do this, reference zybooks and your textbook
         * for help.
         *
         * When you are ready to test it, uncomment the code above and run the
         * code below.
         */

/*
        GenericArrayListPt2<Point> pointList = new GenericArrayListPt2<Point>(2);
        GenericArrayListPt2<Point3D> pointList3D = new GenericArrayListPt2<Point3D>(3);

        pointList.add(new Point(0, 0));
        pointList.add(new Point(2, 2));
        pointList.add(new Point(7, 0));
        pointList.add(new Point(19.16f, 22.32f));

        pointList3D.add(new Point3D(1.0f, 2.0f, 3.0f));
        pointList3D.add(new Point3D(7.3f, 4, 0));

        Point p = pointList.get(2);
        Point3D p3 = pointList3D.get(0);

        // You should get a compilation error on this line! - Why?
        //GenericArrayListPt2<Float> floatList = new GenericArrayList<Float>(2);
    }
}

*/