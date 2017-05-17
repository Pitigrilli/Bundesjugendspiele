/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

/**
 *
 * @author holler.nils
 */
public class Tauchen extends Disziplin{
   public int punktzahlBerechnen(Schueler s, int leistung){
       char geschlecht = s.getGeschlecht();
       int geburtsjahr = s.getGeburtsjahr();
       switch(geschlecht){
           case 'm':    
               switch(geburtsjahr){
                    case 2007:
                        if(leistung<4){
                            return 0;
                        } else if(leistung>=4 && leistung<18){
                            return leistung-3;
                        } else{
                            return 15;
                        }
                        //break;
                    case 2006:
                        if(leistung<4){
                            return 0;
                        } else if(leistung>=4 && leistung<18){
                            return leistung-3;
                        } else{
                            return 15;
                        }
                       // break;
                    case 2005:
                        if(leistung<8){
                            return 0;
                        } else if(leistung>=8 && leistung<22){
                            return leistung-7;
                        } else{
                            return 15;
                        }
                        //break;
                    case 2004: 
                        if(leistung<10){
                            return 0;
                        } else if(leistung>=10 && leistung<24){
                            return leistung-9;
                        } else{
                            return 15;
                        }
                        //break;
                    case 2003:
                        if(leistung<11){
                            return 0;
                        } else if(leistung>=11 && leistung<25){
                            return leistung-10;
                        } else{
                            return 15;
                        }
                        //break;
                    case 2002:
                        if(leistung<12){
                            return 0;
                        } else if(leistung>=12 && leistung<26){
                            return leistung-11;
                        } else{
                            return 15;
                        }
                        //break;
                }
               break;
           case 'w':
               switch(geburtsjahr){
                    case 2007:
                        if(leistung<4){
                            return 0;
                        } else if(leistung>=4 && leistung<18){
                            return leistung-3;
                        } else{
                            return 15;
                        }
                        //break;
                    case 2006:
                        if(leistung<4){
                            return 0;
                        } else if(leistung>=4 && leistung<18){
                            return leistung-3;
                        } else{
                            return 15;
                        }
                        //break;
                    case 2005:
                        if(leistung<6){
                            return 0;
                        } else if(leistung>=6 && leistung<20){
                            return leistung-5;
                        } else{
                            return 15;
                        }
                        //break;
                    case 2004: 
                        if(leistung<7){
                            return 0;
                        } else if(leistung>=7 && leistung<21){
                            return leistung-6;
                        } else{
                            return 15;
                        }
                        //break;
                    case 2003:
                        if(leistung<8){
                            return 0;
                        } else if(leistung>=8 && leistung<22){
                            return leistung-7;
                        } else{
                            return 15;
                        }
                        //break;
                    case 2002:
                        if(leistung<8){
                            return 0;
                        } else if(leistung>=8 && leistung<22){
                            return leistung-7;
                        } else{
                            return 15;
                        }
                        //break;
               }
               break;
       }
   return 0;//fraglich
   } 
}
