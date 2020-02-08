/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.modelo;
import Vista.vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author l03m12
 */
public class controlador implements ActionListener{


    private vista view;
    private modelo model;
    
    
    
    public controlador(vista view, modelo model){
        this.view= view ;
        this.model = model;
        this.view.btnMultiplicar.addActionListener(this);
        
    }   
    
    
    public void iniciar(){
        view.setTitle("MVC MULTIPLICAR");
        view.setLocationRelativeTo(null);
    }
    
    
    public void actionPerformed(ActionEvent e){
        
        model.setNum1(Integer.parseInt(view.txtNum1.getText()));
        model.setNum2(Integer.parseInt(view.txtNum2.getText()));
        model.multiplicar();
        view.txtResultado.setText(String.valueOf(model.getResultado()));
        
        
        
    }
    
}
