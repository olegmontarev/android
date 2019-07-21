public class Main {

    public int counter = 0;

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public synchronized void run() {
                System.out.println("A");
                try {
                    wait();
                } catch (InterruptedException e) {e.printStackTrace();}
                notify();
                System.out.println("A");
                System.out.println("A");
                System.out.println("A");
                System.out.println("A");
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public synchronized void run() {
                notify();
                System.out.println("B");
                try {
                    wait();
                } catch (InterruptedException e) {e.printStackTrace();}

                System.out.println("B");
                System.out.println("B");
                System.out.println("B");
                System.out.println("B");
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public synchronized void run() {
                notify();
                System.out.println("C");
                try {
                    wait();
                } catch (InterruptedException e) {e.printStackTrace();}
                notify();
                System.out.println("C");
                System.out.println("C");
                System.out.println("C");
                System.out.println("C");

            }

        });

    t1.start();
    t2.start();
    t3.start();


    }

}