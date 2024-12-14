package com.csc;

import java.util.ArrayList;

public class QueueTees {
    
    ArrayList<Cutie> items = new ArrayList<>();
    int front, rear;
    int arraySize = 5;
  
    public QueueTees() {
      front = -1;
      rear = -1;
    }
    
    public int size()
    {
      return items.size();
    }

    public boolean isFull() {
      return items.size() == arraySize;
    }
  
    public boolean isEmpty() {
      return items.isEmpty();
    }
  
    public void enqueue(Cutie element) {
      if (isFull()) {
        throw new IllegalStateException("Queue is full");
      }
      items.add(element);
      System.out.println(element + " was added to the queue");
    }
  
    public Cutie dequeue() {
      if (isEmpty()) {
        throw new IllegalStateException("Queue is empty");
      }

      System.out.println(items.get(0) + " was removed to the queue");
      return items.remove(0);
    }
    

    public void clear()
    {
      items.clear();
    }
  
    

  public static void main(String[] args) {
    // Create a bunch of objects that conform to the Cutie interface
    Puppy puppy = new Puppy();
    Kitty kitty = new Kitty();
    PygmyMarmoset marmoset = new PygmyMarmoset();

    // Create a queue data structure
    QueueTees queue = new QueueTees();

    // The size of the queue should equal zero since there are no objects in it
    System.out.println("Current size is: " + queue.size());

    // Add the cuties to the queue
    queue.enqueue(puppy);
    queue.enqueue(kitty);
    queue.enqueue(marmoset);

    // The size of the queue should equal three since there are three objects in it
    System.out.println("Current size is: " + queue.size());

    // The first dequeue should return the puppy
    queue.dequeue();

    // The second dequeue should return the kitty
    queue.dequeue();

    // The first dequeue should return the pygmy marmoset
    queue.dequeue();

    queue.enqueue(marmoset);
    System.out.println("Current size is: " + queue.size());
    queue.clear();

    // The queue size should equal zero
    System.out.println("Current size is: " + queue.size() + " after clearing the queue");
  }
}
