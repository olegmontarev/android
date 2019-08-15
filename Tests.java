import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Tests {

    StackImpl stack = new StackImpl(100);
    QueueImpl queue = new QueueImpl(100);

@Test
public void testStack() {
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    Assert.assertEquals(5, stack.peek());
    Assert.assertEquals(4, stack.pop());
}

@Test
    public void testQueue(){
    queue.insert(1);
    queue.insert(2);
    queue.insert(3);
    queue.insert(4);
    queue.insert(5);
    Assert.assertEquals(1, queue.peek());
    Assert.assertEquals(1, queue.remove());
}

}
