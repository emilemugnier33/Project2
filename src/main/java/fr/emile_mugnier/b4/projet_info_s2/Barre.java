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
public class Barre {
    
    private int identificateur ;
    private Noeuds depart;
    private Noeuds arrive;
    private double tracMax;
    private double ComprMax;
    private int Cout;
    Color couleur;
    
    public Barre(int indentificateur,Noeuds depart,Noeuds arrive,double tracMax,double ComprMax,int Cout, Color couleur){
        this.ComprMax=ComprMax;
        this.Cout=Cout;
        this.arrive=arrive;
        this.depart=depart;
        this.tracMax=tracMax;
        this.identificateur=indentificateur;
        this.couleur=couleur;
    }
    
    public Barre(int indentificateur,Noeuds depart,Noeuds arrive,double tracMax,double ComprMax,int Cout){
        this(indentificateur,depart,arrive,tracMax,ComprMax,Cout,Color.BLUE);
    }
    
    @Override
    public String toString(){
        return "("+depart+','+arrive+','+identificateur+','+tracMax+','+ComprMax+','+Cout+')' ;
    }
    
    public Color getCouleur(){
        return couleur;
    }
    
    public void setCouleur(Color couleur){
        this.couleur= couleur;
    }
    
    public Noeuds getdepart(){
        return depart;
    }
    
    public void setdepart(Noeuds depart){
        this.depart= depart;
    }

    public int getIdentificateur() {
        return identificateur;
    }

    public void setIdentificateur(int identificateur) {
        this.identificateur = identificateur;
    }

    public Noeuds getArrive() {
        return arrive;
    }

    public void setArrive(Noeuds arrive) {
        this.arrive = arrive;
    }

    public double getTracMax() {
        return tracMax;
    }

    public void setTracMax(double tracMax) {
        this.tracMax = tracMax;
    }

    public double getComprMax() {
        return ComprMax;
    }

    public void setComprMax(double ComprMax) {
        this.ComprMax = ComprMax;
    }

    public int getCout() {
        return Cout;
    }

    public void setCout(int Cout) {
        this.Cout = Cout;
    }
    
    public static Noeuds NoeudOpposé(Barre b, Noeuds N){
        if (N==b.depart){
            return b.arrive;}
        
        else{
            return b.depart;}
            
            
        }
    
    
    }

