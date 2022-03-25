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
public abstract class Noeuds {

    double px;
    double py;
    Color couleur;
    
  
    public Noeuds (double px, double py, Color couleur){
        this.couleur=couleur;
        this.px = px;
        this.py = py;  
    }
    
    public Noeuds (double px,double py){
        this(px,py, Color.black);
    }
    
    public Noeuds(){
        this(0,0);
    }
    
    public Color getCouleur(){
        return couleur;
    }
    
    public void setCouleur(Color couleur){
        this.couleur= couleur;
    }
    
    public void setPy(double py){
        this.py=py;
    
    }
    
    public void setPx(double px){
        this.px=px;
    
    }
    
    public double getPy(){
        return py;
    }
    
    public double getPx(){
        return px;
    }
    
    @Override
    public String toString(){
        return "("+px+','+py+')';
    }
    
    /**
     *
     * @param Rep
     * @return
     */
    public static Noeuds EntreNoeuds (int Rep){
        
        System.out.println("Entrez l'abscise du noeud");
        double px=Lire.d();
        System.out.println("Entrez l'ordonné du noeud");
        double py=Lire.d();
        
        if(Rep == 0){
            NoeudSimple N = new NoeudSimple(px,py,Color.black);
            return N;
        }
        else {
            if(Rep==1){
                NoeudAppuiSimple N = new NoeudAppuiSimple(px,py,Color.black);
                return N;
            }
            else{
                NoeudAppuiDouble N = new NoeudAppuiDouble(px,py,Color.black);
                return N;
            }
        }
    
    }
    /**
     *
     * @param args
     */
    public static void main(String[]args){
        
        System.out.println("Veuillez choisir le type de Noeud 0(Simple) 1(AppuiSimple) 2(NoeudDouble)");
        int Rep = Lire.i();
        EntreNoeuds(Rep).toString();
    }            
        
        
    }


                
        
    


