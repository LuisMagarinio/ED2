/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Formularios;

/**
 *
 * @author VAIO
 */
public class Main {
    public static conexion conexion = new conexion();
    
    public static void main(String[] args) {
        System.out.println("Conectado: "+conexion.crearConexion());
        if(conexion.crearConexion()){
            Form f = new Form();
            f.setVisible(true);
        }
    }
}
