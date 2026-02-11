public class PrintService {

    private PrintQueue queue;

    public PrintService() {
        queue = new PrintQueue();
    }

    public void submitJob(PrintJob job) {
        queue.enqueue(job);
    }

    public void processNext() {
        if (queue.isEmpty()) {
            return;
        }

        PrintJob job = queue.dequeue();
        System.out.println("Imprimiendo: " + job);
    }

    public void processAll() {
        while (!queue.isEmpty()) {
            PrintJob job = queue.dequeue();
            System.out.println("Imprimiendo: " + job);
        }
    }
}
