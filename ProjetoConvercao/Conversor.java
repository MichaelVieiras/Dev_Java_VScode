

public class Conversor {
    public double galoes;
    public double litros;

    public Conversor(){

    }

    public Conversor(double galoes, double litros){
        this.galoes = galoes;
        this.litros = litros;
    }

    public void info(){
        litros = galoes * 3.7854;
        System.out.println("\n" + galoes + " galões equivale a " + litros + " litros");
    }
}
