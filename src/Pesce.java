public class Pesce {

    private String tipo;
    private double peso;

    public Pesce(String tipo, double peso) throws Exception{
        this.tipo = tipo;

        if(peso <= 0){
            throw new Exception("Valore non valido");
        }

        this.peso = peso;
    }


}
