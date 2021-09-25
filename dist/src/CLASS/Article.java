/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author ASUS
 */
public class Article {
    private int id_art; 
    private String libelle; 
    private int Qte_stock;

    public Article() {
    }

    public Article(int id_art, String libelle, int Qte_stock) {
        this.id_art = id_art;
        this.libelle = libelle;
        this.Qte_stock = Qte_stock;
    }

    public int getId_art() {
        return id_art;
    }

    public String getLibelle() {
        return libelle;
    }

    public int getQte_stock() {
        return Qte_stock;
    }

    public void setId_art(int id_art) {
        this.id_art = id_art;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setQte_stock(int Qte_stock) {
        this.Qte_stock = Qte_stock;
    }

    @Override
    public String toString() {
        return libelle ;
    }
    
    
}
