public class Acquario {

    private Pesce pesci[];
    private double volume;

    public Acquario(int dim, double volume) throws Exception{
        if(dim <= 0){
            throw new Exception("Valore non valido");
        }

        this.pesci = new Pesce[dim];

        if(volume <= 0){
            throw new Exception("Valore non valido");
        }

        this.volume = volume;
    }

    public Acquario(Pesce[] pesci, double volume) throws Exception{
        if(pesci.length == 0){
            throw new Exception("Dimensione non valida");
        }

        this.pesci = new Pesce[pesci.length];

        if(volume <= 0){
            throw new Exception("Valore non valido");
        }

        this.volume = volume;
    }
}
