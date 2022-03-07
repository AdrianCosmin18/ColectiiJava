package ro.mycode.implement;

import ro.mycode.implement.modele.Masina;

public class Applications {

    public static void main(String[] args) {

     Masina duster = new Masina("Dacia", "Duster", 2020);
     Masina logan = new Masina("Dacia", "Logan", 2022);

     ListImpl<Masina> masini = new ListImpl<>();
     masini.add(new Masina("Renault", "Megane", 2020));
     masini.add(new Masina("Dacia", "Logan", 2022));
     masini.add(new Masina("BMW", "Seria 5", 2015));
     masini.add(new Masina("Mercedes", "Benz", 2019));

     System.out.println(masini.getLast().toString());
     //masini.traverse();






    }


}
