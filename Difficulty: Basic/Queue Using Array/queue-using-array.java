class myQueue {
    int[] q;
    int front;
    int rear;
    int size;
    int count; // number of elements currently in queue

    // Constructor
    public myQueue(int n) {
        size = n;
        q = new int[size];
        front = 0;
        rear = -1;
        count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == size;
    }

    public void enqueue(int x) {
        // if full, do nothing (as GFG expects)
        if (isFull()) return;
        // circular increment of rear
        rear = (rear + 1) % size;
        q[rear] = x;
        count++;
    }

    public void dequeue() {
        // if empty, do nothing
        if (isEmpty()) return;
        // move front circularly
        front = (front + 1) % size;
        count--;
        // optional: when emptied, reset pointers to initial normalized state
        if (count == 0) {
            front = 0;
            rear = -1;
        }
    }

    public int getFront() {
        if (isEmpty()) return -1;
        return q[front];
    }

    public int getRear() {
        if (isEmpty()) return -1;
        return q[rear];
    }
}
