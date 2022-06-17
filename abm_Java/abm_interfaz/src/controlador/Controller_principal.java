/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import vistas.*;

/**
 *
 * @author theBoss
 */
public class Controller_principal {
    
    
    public static Vista_ventaPrincipal ventana  = new Vista_ventaPrincipal();
    public static  void mostrar(){   ventana.setVisible(true); }
    public static  void ocultar(){   ventana.setVisible(false); }
    
    
}
