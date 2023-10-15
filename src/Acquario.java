public class Acquario {

    private Pesce pesci[];
    private double volume;

    public Acquario(int dim, double volume) throws Exception{
        if(dim <= 0){
            throw new Exception("Valore non valido");
        }

        this.pesci = new Pesce[dim];

        if(volume <= 0){
            this.volume = volume;
        }

        this.volume = volume;
    }


}
