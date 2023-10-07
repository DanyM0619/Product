package org.Model;

public class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "{ 'name':" + name + ", price:" + price + ", stock:" + stock + "}";
    }

    public boolean inventario(int stock){
        if(stock <= this.stock){
            System.out.println("Si hay producto en el almacen "+this.name);
            return true;
        }else{
            System.out.println("No hay producto en el almacen "+this.name);
            return false;
        }
    }

    public void valorMayor (double precio){
        if(precio > this.price){
            System.out.println("El valor "+precio+" es mayor al costo del producto. EL valor del producto es: "+this.price);
        }else{
            System.out.println("El valor "+precio+" es incorrecto. El valor del producto es: "+this.price);
        }
    }

    public void valorMenor(double precio){
        if(precio < this.price){
            System.out.println("El valor "+precio+" es menor al costo del producto. El valoe del producto es: "+this.price);
        }else{
            System.out.println("El valor "+precio+" es correcto. El valor del producto es: "+this.price);
        }

    }

    public void contenerTexto(String palabra){
        String letra = this.name.toLowerCase();
        if(letra.contains(palabra.toLowerCase())){
            System.out.println("El producto contiene la letra ingresada. "+this.name);
        }else{
            System.out.println("No contiene la palabra ingresada");
        }
    }
}
