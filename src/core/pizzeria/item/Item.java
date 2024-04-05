/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.pizzeria.item;

/**
 *
 * @author edangulo
 */
public class Item {
    
    private int id;
    private String nombre;
    private int valor;

    public Item(String nombre, int valor) {
        this.id = 0;
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }
    
}
