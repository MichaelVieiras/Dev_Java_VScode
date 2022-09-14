public class SomTrovao {
    
    private double intervalo;

    public SomTrovao(){

    }
    public SomTrovao(double intervalo) {
        this.intervalo = intervalo;
    }
    public double getIntervalo() {
        return intervalo;
    }

    public void setIntervalo(double intervalo) {
        this.intervalo = intervalo;
    }

    public double calcularDistancia(){
        return intervalo * 1100;
    }

    public double convercaoMetro(){
        double convercaoM = calcularDistancia() / 3.281;
        return convercaoM;
    
    }
}
