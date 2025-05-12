public class PrinterClass implements Printer{
    @Override
    public void print(String document) {
        System.out.println("Printer: tipărire document: " + document);
    }
}
