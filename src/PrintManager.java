public class PrintManager {
    public static void main(String[] args) {
        PrintService service = new PrintService();

        service.submitJob(new PrintJob("Freddy", 10, 'M'));
        service.submitJob(new PrintJob("Pedro", 9, 'H'));
        service.submitJob(new PrintJob("Adrian", 8, 'L'));
        service.submitJob(new PrintJob("Luna", 7, 'H'));
        service.submitJob(new PrintJob("Juan", 6, 'M'));

       // service.processNext();
        service.processAll();
    }
}