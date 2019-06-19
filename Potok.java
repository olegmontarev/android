public class Potok {
    static final int size = 10000000;
    static final int h = size / 2;
    float[] array = new float[size];
    float[] array1 = new float[size];
    float[] array2 = new float[size];
    float[] array3 = new float[size];

    public Potok(){}

    public void methodOne() {
        long a = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            array[i] = 1;
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));}
        System.out.println(System.currentTimeMillis() - a);
    }

    public void methodTwo() {
        long a = System.currentTimeMillis();
        System.arraycopy(array1, 0, array2, 0, h);
        System.arraycopy(array1, h, array3, 0, h);
        MyThread threadOne = new MyThread(array2);
        MyThread threadTwo = new MyThread(array3);
        threadOne.run();
        threadTwo.run();
        System.arraycopy(array2, 0, array1, 0, h);
        System.arraycopy(array3, 0, array1, h, h);
        System.out.println(System.currentTimeMillis() - a);
    }

    public class MyThread extends Thread {
        private float[] arrays;
        MyThread(float... arrays){this.arrays = arrays;}
        public void run() {
            for (int i = 0; i < arrays.length; i++) {
                arrays[i] = 1;
                arrays[i] = (float) (arrays[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        }
    }



    public static void main(String[] args) {
        Potok potok = new Potok();
        Potok potok1 = new Potok();
        potok.methodOne();
        potok1.methodTwo();
    }


}
