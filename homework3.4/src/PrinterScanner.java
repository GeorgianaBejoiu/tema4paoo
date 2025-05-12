public class PrinterScanner implements Printer, Scanner{
    @Override
    public void print(String document) {
        System.out.println("PrinterScannerImpl: tipărire: " + document);
    }

    @Override
    public String scan() {
        String rezultat = "PrinterScannerImpl: document scanat";
        System.out.println(rezultat);
        return rezultat;
    }
}
