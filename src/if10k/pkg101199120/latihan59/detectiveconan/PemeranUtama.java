/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg101199120.latihan59.detectiveconan;

/**
 *
 * @author 
 * NAMA  : Rezki Ramadhan
 * KELAS : IF10K
 * NIM  `: 10119912
 */ 
public class PemeranUtama extends KarakterPemain{
    private String namaSamaran;

    public PemeranUtama(String name, String food, String sifat, int umur) {
        super(name, food, sifat, umur);
        this.nama=name;
        this.makanan=food;
        this.sifat=sifat;
        this.umur=umur;
    }

    public String getNamaSamaran() {
        return namaSamaran;
    }

    public void setNamaSamaran(String namaSamaran) {
        this.namaSamaran = namaSamaran;
    }
    
    
}
