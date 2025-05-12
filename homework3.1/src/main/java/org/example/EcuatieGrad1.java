package org.example;

import org.json.JSONObject;
import java.io.FileWriter;
import java.io.IOException;

public class EcuatieGrad1 {
    private double a;
    private double b;

    public EcuatieGrad1(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public JSONObject rezolva() {
        JSONObject rezultat = new JSONObject();

        rezultat.put("a", a);
        rezultat.put("b", b);
        rezultat.put("ecuatia", a + "x + " + b + " = 0");

        if (a == 0 && b == 0) {
            rezultat.put("tip", "Infinit de soluții");
            rezultat.put("solutie", "Toate numerele reale");
        } else if (a == 0) {
            rezultat.put("tip", "Fără soluție");
            rezultat.put("solutie", JSONObject.NULL);
        } else {
            double x = -b / a;
            rezultat.put("tip", "Soluție unică");
            rezultat.put("solutie", x);
        }

        return rezultat;
    }

    public void salveazaJSON(String caleFisier) {
        JSONObject rezultat = rezolva();
        try (FileWriter fisier = new FileWriter(caleFisier)) {
            fisier.write(rezultat.toString(4)); // frumos indentat
            System.out.println("Rezultatul a fost salvat în: " + caleFisier);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
