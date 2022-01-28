public class QueueNew {
    int SIZE = 5;
    int items[] = new int[SIZE];
    int front, rear;

    QueueNew() {
        front = -1;
        rear = -1;
    }

    // check if the QueueNew is full
    boolean isFull() {
        if (front == 0 && rear == SIZE - 1) {
            return true;
        }
        return false;
    }

    // check if the QueueNew is empty
    boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    // insert elements to the QueueNew
    void enQueueNew(int element) {

        // if QueueNew is full
        if (isFull()) {
            System.out.println("QueueNew is full");
        }
        else {
            if (front == -1) {
                // mark front denote first element of QueueNew
                front = 0;
            }

            rear++;
            // insert element at the rear
            items[rear] = element;
            System.out.println("Insert " + element);
        }
    }

    // delete element from the QueueNew
    int deQueueNew() {
        int element;

        // if QueueNew is empty
        if (isEmpty()) {
            System.out.println("QueueNew is empty");
            return (-1);
        }
        else {
            // remove element from the front of QueueNew
            element = items[front];

            // if the QueueNew has only one element
            if (front >= rear) {
                front = -1;
                rear = -1;
            }
            else {
                // mark next element as the front
                front++;
            }
            System.out.println( element + " Deleted");
            return (element);
        }
    }

    // display element of the QueueNew
    void display() {
        int i;
        if (isEmpty()) {
            System.out.println("Empty QueueNew");
        }
        else {
            // display the front of the QueueNew
            System.out.println("\nFront index-> " + front);

            // display element of the QueueNew
            System.out.println("Items -> ");
            for (i = front; i <= rear; i++)
                System.out.print(items[i] + "  ");

            // display the rear of the QueueNew
            System.out.println("\nRear index-> " + rear);
        }
    }

    public static void main(String[] args) {

        // create an object of QueueNew class
        QueueNew q = new QueueNew();

        // try to delete element from the QueueNew
        // currently QueueNew is empty
        // so deletion is not possible
        q.deQueueNew();

        // insert elements to the QueueNew
        for(int i = 1; i < 6; i ++) {
            q.enQueueNew(i);
        }

        // 6th element can't be added to QueueNew because QueueNew is full
        q.enQueueNew(6);

        q.display();

        // deQueueNew removes element entered first i.e. 1
        q.deQueueNew();

        // Now we have just 4 elements
        q.display();

    }
}