/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obchod;

import java.util.ArrayList;

/**
 *
 * @author bauerpe1
 */
public class Kosik {
    private final ArrayList<Polozka> polozky;
    
    
    public Kosik()
    {
        this.polozky = new ArrayList<>();
    }


    public int indexPolozky(Zbozi z)
    {
        return -1;
    }

    public void pridejPolozku(Zbozi z)
    {
    }
    
    public void zvysMnozstvi(int index)
    {
    }

    public void snizMnozstvi(int index)
    {
    }

    public void vyprazdni()
    {
    }

    public String[] asStringArray()
    {
        String [] obsah = new String[polozky.size()];
        for (int i = 0; i < polozky.size(); i++)
            obsah[i] = polozky.get(i).toString();

        return obsah;
    }

    @Override
    public String toString()
    {
        StringBuilder b = new StringBuilder();
        for (Polozka p:polozky)
        {
            b.append(p).append("\n");
        }
        
        return b.toString();
    }
}
