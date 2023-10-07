package org.Model;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Product inventario1 = new Product("Leche", 4200,15);

        inventario1.inventario(5);
        inventario1.valorMayor(4500);
        inventario1.valorMenor(3000);
        inventario1.contenerTexto("c");
    }
}