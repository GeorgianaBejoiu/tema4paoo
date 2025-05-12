//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Printer printer = new PrinterClass();
        printer.print("Fișă medicală");

        PrinterScanner ps = new PrinterScanner();
        ps.print("Cerere ofertă");
        String scan = ps.scan();

        MultifunctionalPrinter mfp = new FullMultifunctionalPrinter();
        mfp.print("Broșură produs");
        String scanat = mfp.scan();
        mfp.fax(scanat);
    }
}