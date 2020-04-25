/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obchod;

/**
 *
 * @author bauerpe1
 */
public class Zbozi
{
    private final String nazev;
    private final int jednotkoveMnozstvi;
    private final String jednotka;
    private int jednotkovaCena;

    public String getNazev() {
        return nazev;
    }

    public int getJednotkovaCena() {
        return jednotkovaCena;
    }

    public int getJednotkoveMnozstvi() {
        return jednotkoveMnozstvi;
    }

    public String getJednotka() {
        return jednotka;
    }


    public Zbozi(String nazev, int jednotkoveMnozstvi, String jednotka, int jednotkovaCena) {
        this.nazev = nazev;
        this.jednotkoveMnozstvi = jednotkoveMnozstvi;
        this.jednotka = jednotka;
        this.jednotkovaCena = jednotkovaCena;
    }
    
    public boolean equals(Zbozi z)
    {
        return nazev.equals(z.nazev);
    }
    
    @Override
    public String toString()
    {
        return String.format("%s [%d Kč/%s]", nazev, jednotkovaCena, (jednotkoveMnozstvi == 1 ? jednotka : (jednotkoveMnozstvi + jednotka)));
    }
}
