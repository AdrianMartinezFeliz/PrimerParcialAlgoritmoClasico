public class PrintQueue {

    private SimpleQueue<PrintJob> highPriority;
    private SimpleQueue<PrintJob> mediumPriority;
    private SimpleQueue<PrintJob> lowPriority;

    public PrintQueue() {
        highPriority = new SimpleQueue<>();
        mediumPriority = new SimpleQueue<>();
        lowPriority = new SimpleQueue<>();
    }

    public void enqueue(PrintJob job) {
        char priority = job.getPriority();

        if (priority == 'H') {
            highPriority.enqueue(job);
        } else if (priority == 'M') {
            mediumPriority.enqueue(job);
        } else if (priority == 'L') {
            lowPriority.enqueue(job);
        } else {
            mediumPriority.enqueue(job);
        }
    }

    public PrintJob dequeue() {
        if (!highPriority.isEmpty()) {
            return highPriority.dequeue();
        } else if (!mediumPriority.isEmpty()) {
            return mediumPriority.dequeue();
        } else if (!lowPriority.isEmpty()) {
            return lowPriority.dequeue();
        } else {
            throw new IllegalStateException("No hay trabajos en la cola");
        }
    }

    public boolean isEmpty() {
        return highPriority.isEmpty() &&
                mediumPriority.isEmpty() &&
                lowPriority.isEmpty();
    }
}