/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.emile_mugnier.b4.projet_info_s2;

import java.awt.Color;

/**
 *
 * @author emile
 */
public class NoeudSimple extends Noeuds{

    public NoeudSimple(double px, double py, Color couleur) {
        this.couleur=couleur;
        this.px = px;
        this.py = py;
    }
    
    public NoeudSimple (double px,double py){
        this(px,py, Color.black);
    }
    
    public NoeudSimple(){
        this(0,0);
    }
    
    
     @Override
    public String toString(){
        return "("+px+','+py+')';
    }
    
  
   
}
