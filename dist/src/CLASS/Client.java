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
public class Client {
    private int id_clt ;
    private String nom ;
  //  private String prenom; 
    private String mail ;
    private String tel ;
    private int ice; 

    public Client() {
    }

    public Client(int id_clt, String nom, String mail, String tel, int ice) {
        this.id_clt = id_clt;
        this.nom = nom;
     //   this.prenom = prenom;
        this.mail = mail;
        this.tel = tel;
        this.ice = ice;
    }

    public int getId_clt() {
        return id_clt;
    }

    public String getNom() {
        return nom;
    }

    //public String getPrenom() {
      //  return prenom;
    //}

    public String getMail() {
        return mail;
    }

    public String getTel() {
        return tel;
    }

    public int getIce() {
        return ice;
    }

    public void setId_clt(int id_clt) {
        this.id_clt = id_clt;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    //public void setPrenom(String prenom) {
      //  this.prenom = prenom;
    //}

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setIce(int ice) {
        this.ice = ice;
    }

    @Override
    public String toString() {
        return  nom ;
    }

}
