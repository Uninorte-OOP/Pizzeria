/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.person;

import core.pizzeria.item.Item;
import core.pizzeria.pedido.Pedido;
import core.pizzeria.pedido.PedidoOnLine;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author edangulo
 */
public class Cliente {
    
    private String nombre;
    private ArrayList<Pedido> pedidos;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.pedidos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    
    public boolean addPedido(Pedido pedido) {
        if (!this.pedidos.contains(pedido)) {
            this.pedidos.add(pedido);
            return true;
        }
        return false;
    }
    
    public HashMap<String, Integer> getFrecuenciaPedidos(ArrayList<String> items) {
        HashMap<String, Integer> frecuenciaPedidos = new HashMap<>();
        for (String item : items) {
            frecuenciaPedidos.put(item, 0);
        }
        for (Pedido pedido : this.pedidos) {
            if (pedido instanceof PedidoOnLine) {
                for (Item item : pedido.getItems()) {
                    frecuenciaPedidos.put(item.getNombre(), frecuenciaPedidos.get(item.getNombre()) + 1);
                }
            }
        }
        return frecuenciaPedidos;
    }
    
}
