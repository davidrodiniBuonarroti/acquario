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

    public String getTipo(){
        return this.tipo;
    }

    public double getPeso(){
        return this.peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public Pesce clone(){
        try {
            return new Pesce(this.tipo, this.peso);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }







}
