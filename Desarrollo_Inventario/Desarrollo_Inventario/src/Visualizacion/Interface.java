/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visualizacion;

import java.util.ArrayList;
import java.util.Iterator;

import PostgreSQl.pgsql_dbc;



/**
 *
 * @author ALLCH
 */



public class Interface {
    
   // Crear objCrear = new Crear();
    
//    // Constructor
    public Interface() {
      //objCrear  = new Crear();
    }

    pgsql_dbc objetoConexion = new pgsql_dbc();
     
    // VisualizarClientes objVisualizar = new VisualizarClientes();

    public String[][] mostrarClientes() {

        int contador = 0;
        int numCol = 8; //Equivale al numero de columnas de la base de datos
        int numFila = 0;  // Lo calcula a partir de el numero total del arraylist

        ArrayList<String> arregloEntrada = new ArrayList<String>();
        arregloEntrada = objetoConexion.mostrarTablaCompleta("clientes", numCol);

        numFila = arregloEntrada.size() / numCol;

        String[] arr = new String[arregloEntrada.size()];
        String[][] matrizClientes = new String[numCol][numFila];

// Conversion de arrayList a arreglo unidimensional
        for (int i = 0; i < arregloEntrada.size(); i++) {
            arr[i] = arregloEntrada.get(i);
        }
//         Mostrar datos de el arreglo 
//        for (String x : arr) 
//            System.out.print(x + " "); 
//        
//Conversion del arreglo unidimensional a matriz
        for (int i = 0; i < numFila; i++) {

            for (int j = 0; j < numCol; j++) {
                matrizClientes[j][i] = arr[contador];
                contador++;
            }
        }
        //  Mostrar los datos de la matriz

//        for(int i = 0; i<  11; i++){
//            
//            for (int j =0; j < 4; j++) {
//            System.out.print(matrizClientes[j][i] + "\t") ;
//            
//            }
//            System.out.print("\n");
//        }
        return matrizClientes;
    }
    
    
    public String[][] mostrarProductos() {

        int contador = 0;
        int numCol = 7; //Equivale al numero de columnas de la base de datos
        int numFila = 0;

        ArrayList<String> arregloEntrada = new ArrayList<String>();
        //nombre de la tabla producto, numcol determinada a la hora de crear la base de datos
        arregloEntrada = objetoConexion.mostrarTablaCompleta("producto", numCol); 

        numFila = arregloEntrada.size() / numCol;

        String[] arr = new String[arregloEntrada.size()];
        String[][] matrizProductos = new String[numCol][numFila];

// Conversion de arrayList a arreglo unidimensional
        for (int i = 0; i < arregloEntrada.size(); i++) {
            arr[i] = arregloEntrada.get(i);
        }
  
//Conversion del arreglo unidimensional a matriz
        for (int i = 0; i < numFila; i++) {

            for (int j = 0; j < numCol; j++) {
                matrizProductos[j][i] = arr[contador];
                contador++;
            }
        }
  
        return matrizProductos;
    }
    
    
    public String CrearProducto() {
               
       // String tuplaNuevoProducto = Crear.datosNuevoProducto();

       // objetoConexion.llenaTabla(tuplaNuevoProducto);    
        return "";
    }
    
    
    
}
    

