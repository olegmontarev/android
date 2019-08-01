import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public Main() {
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Main main = new Main();
        main.start(Tests.class);
    }

    public void start(Class cl) throws InvocationTargetException, IllegalAccessException {
        Tests tests = new Tests();
        Method[] methods = cl.getDeclaredMethods();
        for (Method methodone : methods) {
            if (methodone.isAnnotationPresent(BeforeSuite.class)) {
                methodone.invoke(tests);
            }
        }
        for (Method methodtwo : methods) {
            if (methodtwo.isAnnotationPresent(Testing.class)) {
                methodtwo.invoke(tests);
            }
        }
        for (Method methodthree : methods) {
            if (methodthree.isAnnotationPresent(AfterSuite.class)) {
                methodthree.invoke(tests);
            }
        }
    }
}


