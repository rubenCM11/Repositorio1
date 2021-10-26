
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DAM106
 */
public class practica1 
extends JFrame{
   public practica1(){
       JLabel lblsaludo = new JLabel("hola");
       add(lblsaludo);
       
       this.setSize(200,200);
       this.setTitle("JFrame");
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setVisible(true);
   }
    public static void main(String[] args){
        new practica1();
    }

    
}
