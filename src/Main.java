public class Main {
    public static void main (String[] args) {

        Acquario acquario = null;
        try {
            acquario = new Acquario(3,100);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }

        acquario.addPesce("Rosso", 2)

    }

}
