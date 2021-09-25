/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Commande {
    private int id_cmd;
    private Date datecmd;
    private int id_clt;

    public Commande() {
    }

    public Commande(int id_cmd, Date datecmd, int id_clt) {
        this.id_cmd = id_cmd;
        this.datecmd = datecmd;
        this.id_clt = id_clt;
    }

    public int getId_cmd() {
        return id_cmd;
    }

    public Date getDatecmd() {
        return datecmd;
    }

    public int getId_clt() {
        return id_clt;
    }

    public void setId_cmd(int id_cmd) {
        this.id_cmd = id_cmd;
    }

    public void setDatecmd(Date datecmd) {
        this.datecmd = datecmd;
    }

    public void setId_clt(int id_clt) {
        this.id_clt = id_clt;
    }

    @Override
    public String toString() {
        return id_cmd +"";
    }
    
    
}
