
public class ABC {
    private char flag = 'a';

    public synchronized void A() {
        while (flag == 'b' || flag == 'c') {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        flag = 'b';
        System.out.println("A");
        notifyAll();
    }

    public synchronized void B() {
        while (flag == 'a' || flag == 'c') {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        flag = 'c';
        System.out.println("B");
        notifyAll();
    }

    public synchronized void C() {
        while (flag == 'a'|| flag == 'b') {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        flag = 'a';
        System.out.println("C");
        notifyAll();
    }
}

class A implements Runnable {

    ABC go;

    public A(ABC go) {
        this.go = go;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            go.A();
        }
    }
}

class B implements Runnable {
    ABC go;

    public B(ABC go) {
        this.go = go;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            go.B();
        }
    }
}

class C implements Runnable {
    ABC go;

    public C(ABC go) {
        this.go = go;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            go.C();
        }
    }
}


class mainABC {
    public static void main(String[] args) {
        ABC go = new ABC();

        A a = new A(go);
        B b = new B(go);
        C c = new C(go);

        new Thread(a).start();
        new Thread(b).start();
        new Thread(c).start();
    }
}