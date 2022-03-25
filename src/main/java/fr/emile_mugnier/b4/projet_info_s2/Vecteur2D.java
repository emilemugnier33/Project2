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
public class Vecteur2D {
    
    private double vx;
    private double vy;
    Color couleur ;
    
    public Vecteur2D(double vx , double vy, Color couleur){
        this.vx = vx;
        this.vy = vy;
        this.couleur = couleur;
    }
    
    public Vecteur2D(double vx , double vy){
        this(vx,vy,Color.GREEN );
    }
    
    public Vecteur2D(){
        this(0,0);
    }
    
    public Color getCouleur(){
        return couleur;
    }
    
    public void setCouleur(Color couleur){
        this.couleur= couleur;
    }
    
    public void setVy(double vy){
        this.vy=vy;
    
    }
    
    public void setVx(double vx){
        this.vx=vx;
    
    }
    
    public double getVy(){
        return vy;
    }
    
    public double getVx(){
        return vx;
    }
    
    @Override
    public String toString(){
        return "("+vx+','+vy+')';
    }
    
    
    
    }