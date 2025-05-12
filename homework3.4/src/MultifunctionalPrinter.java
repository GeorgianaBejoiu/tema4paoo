// Clasa completă care implementează MultifunctionalPrinter
public interface MultifunctionalPrinter extends Printer, Scanner, Fax{
    void print(String document);
    String scan();
    void fax(String document);
}
