/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.pizzeria;

import core.person.Cliente;
import core.pizzeria.item.Item;
import core.pizzeria.pedido.Pedido;
import java.util.ArrayList;

/**
 *
 * @author edangulo
 */
public class Pizzeria {
    
    private String nombre;
    private ArrayList<Cliente> clientes;
    private ArrayList<Item> items;
    private ArrayList<Pedido> pedidos;

    public Pizzeria() {
        this.nombre = "Default name";
        this.clientes = new ArrayList<>();
        this.items = new ArrayList<>();
        this.items = new ArrayList<>();
    }
    
    public Cliente getCliente(int index) {
        return this.clientes.get(index);
    }
    
    public Item getItem(int index) {
        return this.items.get(index);
    }
    
    public boolean addCliente(Cliente cliente) {
        if (!this.clientes.contains(cliente)) {
            this.clientes.add(cliente);
            return true;
        }
        return false;
    }
    
    public boolean addItem(Item item) {
        if (!this.items.contains(item)) {
            this.items.add(item);
            return true;
        }
        return false;
    }
    
    public boolean addPedido(Pedido pedido) {
        if (!this.pedidos.contains(pedido)) {
            this.pedidos.add(pedido);
            return true;
        }
        return false;
    }
    
    public int calcProdMasVendidoCliente(int numCliente) {
        return -1;
    }
    
}
