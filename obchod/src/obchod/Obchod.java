/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obchod;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author bauerpe1
 */
public class Obchod {

    private ArrayList<Zbozi> zbozi;
    
    public Obchod()
    {
        zbozi = new ArrayList<>();
        
        pripravSortiment();
    }
    
    public final void pripravSortiment()
    {
        zbozi.add(new Zbozi("rohlík", 1, "ks", 3));
        zbozi.add(new Zbozi("máslo", 250, "g", 45));
        zbozi.add(new Zbozi("mléko", 1, "l", 25));
        zbozi.add(new Zbozi("čokoláda", 1, "ks", 18));
        zbozi.add(new Zbozi("kofola", 2, "l", 24));
        zbozi.add(new Zbozi("noviny", 1, "ks", 20));
        zbozi.add(new Zbozi("banány", 1, "kg", 22));
        zbozi.add(new Zbozi("pomeranče", 1, "kg", 32));
        zbozi.add(new Zbozi("mrkev", 1, "kg", 30));
    }
    
    public Zbozi zbozi(int index)
    {
        return zbozi.get(index);
    }
    
    public void odstranZbozi(int index)
    {
    }
    
    public void pridejZbozi(String nazev, int jednotkoveMnozstvi, String jednotka, int jednotkovaCena)
    {
    }

    public void vymazNabidku()
    {
    }
    
    public String sestavUctenku(Kosik kosik)
    {
    StringBuilder b = new StringBuilder("Offline obchod KupSiCoChceš\n");
        b.append(new Date()).append("\n");

        b.append("Děkujeme, přijďte zas!\n");
    
        return b.toString();
    }
    
    public void nactiNabidku(File file)
    {
        try
        {
           // Assume default encoding.
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            zbozi.clear();
            String line;
            while ((line = bufferedReader.readLine()) != null)
            {
                String [] tokens = line.split(";");
                Zbozi z = new Zbozi (tokens[0],Integer.parseInt(tokens[1]),tokens[2],Integer.parseInt(tokens[3]));
                zbozi.add(z);
            }
                bufferedReader.close();
        }
        catch(IOException ex)
        {
            System.out.format("Error reading from file '%s'", file);
        }
    }
    
    public void ulozNabidku(File file)
    {
        try
        {
           // Assume default encoding.
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (Zbozi z : zbozi)
                bufferedWriter.write(z.getNazev()+";" +z.getJednotkoveMnozstvi()+ ";"+ z.getJednotka() + ";" + z.getJednotkovaCena() + "\n");
            bufferedWriter.close();
        }
        catch(IOException ex)
        {
            System.out.format("Error writing to file '%s'", file);
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }
    
    public String[] nabidkaAsStringArray()
    {
        String [] pole = new String[zbozi.size()];
        for (int i = 0; i < zbozi.size(); i++)
            pole[i] = zbozi.get(i).toString();
        return pole;
    }
}
