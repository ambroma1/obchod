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
public class Polozka
{
    private final Zbozi zbozi;
    private int mnozstvi;

    public Polozka(Zbozi zbozi, int mnozstvi) {
        this.zbozi = zbozi;
        this.mnozstvi = mnozstvi;
    }

    public void zvysMnozstvi()
    {
    }
    
    public void snizMnozstvi()
    {
    }

    public int cena()
    {
        return 0;
    }
    
    @Override
    public String toString()
    {
        return String.format("%s * %d %s", zbozi, mnozstvi, zbozi.getJednotka());
    }
}
