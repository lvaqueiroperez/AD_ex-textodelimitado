/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex8_textodelimitado;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author oracle
 */
public class Ex8_textodelimitado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        String[] cod = {"p1", "p2", "p3"};
        String[] desc = {"parafusos", "cravos", "tachas"};
        Double[] prezo = {3d, 4d, 5d};

        FileWriter file1 = new FileWriter("/home/oracle/Desktop/ex8/productosDelimitados.txt");
        BufferedWriter bufferFile = new BufferedWriter(file1);
        PrintWriter pwFile = new PrintWriter(bufferFile);

        for (int i = 0; i < prezo.length; i++) {

            pwFile.println(cod[i] + "\t" + desc[i] + "\t" + prezo[i]);

        }

        pwFile.close();
        bufferFile.close();
        file1.close();

        FileReader readFile1 = new FileReader("/home/oracle/Desktop/ex8/productosDelimitados.txt");
        BufferedReader bufferRead1 = new BufferedReader(readFile1);

        //Split devuelve un Array de elementos !!!
        //devuelve null si se ha llegado al final
        //cada vez que ejecutamos readLine().split() vemos, haciendo la comprobación,
        //que lee una línea por cada ejecución
        //Usamos solo un objeto para mostrar por pantalla los 3 productos:
        String[] arrayDatos;
        Product productos = new Product();
        String linea;
        //leemos y a la vez preguntamos !!! (en la misma pregunta del while ya le damos un valor !!!)
        while ((linea = bufferRead1.readLine()) != null) {
            //leemos toda la línea y gracias al método split(), cada división hecha
            //por un tabulador ocupará una posición distinta en el array !!!
            arrayDatos = linea.split("\t");

            productos.setCodigo(arrayDatos[0]);
            productos.setDescripcion(arrayDatos[1]);
            productos.setPrecio(Double.parseDouble(arrayDatos[2]));

            System.out.println(productos.toString());

        }

        file1.close();
        bufferFile.close();
        pwFile.close();

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

    @Override
    public String toString() {
        return "Product{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + '}';
    }

}
