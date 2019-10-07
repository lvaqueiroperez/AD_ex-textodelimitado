/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex8_textodelimitado;

/**
 *
 * @author oracle
 */
public class Ex8_textodelimitado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        
    }

}

class Product {

    private String codigo;
    private String descripcion;
    private Double precio;

    public Product() {

        codigo = "";
        descripcion = "";
        precio = 0d;

    }

    public Product(String codigo, String descripcion, Double precio) {

        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;

    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

}
