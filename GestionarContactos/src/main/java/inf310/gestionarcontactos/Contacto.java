/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inf310.gestionarcontactos;
import inf310.arbolesbiinariosbusqueda.ArbolBinarioBusqueda;
import inf310.arbolesbiinariosbusqueda.AVL;
import MVias.ArbolMViasBusqueda;
import javax.swing.JOptionPane;

/**
 *
 * @author Charles
 */
public class Contacto implements Comparable<Contacto> {
    private String nombre;
    private String telefono;

    // Constructor, getters y setters
    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        
}

    @Override
    public int compareTo(Contacto otro) {
        return this.nombre.compareTo(otro.nombre);  // O según el criterio que prefieras
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getTelefono() {
        return telefono;
    }



}
