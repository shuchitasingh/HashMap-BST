package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueueTest {
    private Assertions Assert;

    @Test
    public void givenThreeNumbersWhenAddedShouldAddedLast() {
        MyNode<Integer> myFirstNode=new MyNode<>(56);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(70);
        MyQueue queue=new MyQueue();
        queue.enqueue(myFirstNode);
        queue.enqueue(mySecondNode);
        queue.enqueue(myThirdNode);
        INode result=queue.checkQueue();
        Assert.assertEquals(myFirstNode,result);

    }

    @Test
    public void givenThreeNumbersWhenDequeueFromBeginingShouldEmptyTheDequeue(){
        MyNode<Integer> myFirstNode=new MyNode<>(56);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(70);
        MyQueue queue=new MyQueue();
        queue.enqueue(myFirstNode);
        queue.enqueue(mySecondNode);
        queue.enqueue(myThirdNode);
        queue.deQueue();
        boolean result=queue.isEmpty();
        Assert.assertTrue(result);
    }
}
