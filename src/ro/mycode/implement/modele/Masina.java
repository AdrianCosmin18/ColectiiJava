package ro.mycode.implement.modele;

public class Masina implements Comparable<Masina>{

    private String marca;
    private String model;
    private int an;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public Masina(String marca, String model, int an) {

        this.marca = marca;
        this.model = model;
        this.an = an;
    }

    @Override
    public String toString(){

        return marca + "," + model + "," + an;
    }

    @Override
    public boolean equals(Object o){

        Masina m = (Masina) o;
        return this.marca.equals(m.marca) && this.model.equals(m.model);
    }


    @Override
    public int compareTo(Masina o) {

          if(this.an>o.an){
              return  1;
          }else if(this.an == o.an){
              return 0;
          }else{
              return -1;
          }
    }
}
