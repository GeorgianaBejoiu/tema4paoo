public class FullMultifunctionalPrinter implements MultifunctionalPrinter{
    @Override
    public void print(String document) {
        System.out.println("Full MultifunctionalPrinter: tipărire document: " + document);
    }

    @Override
    public String scan() {
        String rezultat = "Full MultifunctionalPrinter: scanare efectuată";
        System.out.println(rezultat);
        return rezultat;
    }

    @Override
    public void fax(String document) {
        System.out.println("Full MultifunctionalPrinter: fax trimis cu documentul: " + document);
    }
}
