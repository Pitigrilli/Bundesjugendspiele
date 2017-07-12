/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import javax.swing.JFileChooser;
import java.io.File;

/**
 *
 * @author finckh.stefan
 */
public class testImport {

    public static void main(String[] args) {
            
            helper.Import test = new helper.Import();
            modell.BJS bjs = test.gibBJS();
            
            for(modell.Jahrgang j : bjs.getJahrgangliste()){
                System.out.println(j.getName() + ":");
                for(modell.Klasse k : j.getKlassen()){
                    System.out.println(k.getName());
                }
            }
            }

        

    }

