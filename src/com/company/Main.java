package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println ("2400 est bissextile:"+isBissextile(2400));
	// write your code here
    }
    public static boolean isBissextile (int annee)  {
            boolean resultat= false;
        if (annee%4==0){
            if (annee%100==0){
                if (annee%400==0){
                    resultat = true;
                }
            }
            else{
                resultat=true;
            }
        }
     return resultat;
    }

}
