package com.csc;

public class QueueTees {
    int SIZE = 5;
    Cutie items[] = new Cutie[SIZE];
    int front, rear;
  
    public QueueTees() {
      front = -1;
      rear = -1;
    }
    
    public int size()
    {
      return items.length;
    }

    public boolean isFull() {
      if (rear == SIZE - 1) {
        return true;
      }
      return false;
    }
  
    public boolean isEmpty() {
      if (front == -1)
        return true;
      else
        return false;
    }
  
    public void enqueue(Cutie element) {
      if (isFull()) {
        System.out.println("Queue is full");
      } else {
        if (front == -1)
          front = 0;
        rear++;
        items[rear] = element;
        System.out.println("Inserted " + element);
      }
    }
  
    public Cutie dequeue() {
      Cutie element;
      if (isEmpty()) {
        System.out.println("Queue is empty");
        throw new RuntimeException("Queue is empty");
        
      } else {
        element = items[front];
        if (front >= rear) {
          front = -1;
          rear = -1;
        } /* Q has only one element, so we reset the queue after deleting it. */
        else {
          front++;
        }
        System.out.println("Deleted -> " + element);
        return (element);
      }
    }
  
    public void display() {
      /* Function to display elements of Queue */
      int i;
      if (isEmpty()) {
        System.out.println("Empty Queue");
      } else {
        System.out.println("\nFront index-> " + front);
        System.out.println("Items -> ");
        for (i = front; i <= rear; i++)
          System.out.print(items[i] + "  ");
  
        System.out.println("\nRear index-> " + rear);
      }
    }

  public static void main(String[] args) {
    // Create a bunch of objects that conform to the Cutie interface
    Puppy puppy = new Puppy();
    Kitty kitty = new Kitty();
    PygmyMarmoset marmoset = new PygmyMarmoset();

    // Create a queue data structure
    QueueTees queue = new QueueTees();

    // The size of the queue should equal zero since there are no objects in it
    queue.size();

    // Add the cuties to the queue
    queue.enqueue(puppy);
    queue.enqueue(kitty);
    queue.enqueue(marmoset);

    // The size of the queue should equal three since there are three objects in it
    queue.size();

    // The first dequeue should return the puppy
    queue.dequeue();

    // The second dequeue should return the kitty
    queue.dequeue();

    // The first dequeue should return the pygmy marmoset
    queue.dequeue();
  }
}
