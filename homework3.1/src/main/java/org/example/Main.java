package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți coeficientul a: ");
        double a = scanner.nextDouble();

        System.out.print("Introduceți coeficientul b: ");
        double b = scanner.nextDouble();

        EcuatieGrad1 ecuatie = new EcuatieGrad1(a, b);
        ecuatie.salveazaJSON("rezultat.json");

        scanner.close();
    }
}
