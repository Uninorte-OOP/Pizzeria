/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.pizzeria.pedido;

import core.person.Cliente;
import core.pizzeria.item.Item;
import java.util.ArrayList;

/**
 *
 * @author edangulo
 */
public class PedidoTelefono extends Pedido {
    
    private String telefono;

    public PedidoTelefono(Cliente cliente, String telefono, ArrayList<Item> items) {
        super(cliente, items);
        this.telefono = telefono;
    }
    
}
