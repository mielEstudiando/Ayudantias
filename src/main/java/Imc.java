import java.util.Scanner;

public class Imc {

    public void main(String[] args) {
        System.out.println("Funcionando");
    }

    private String scanner(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static boolean verificarNumero(String numero){
        try {
            Double.parseDouble(numero);
            return false;
        } catch (NumberFormatException e) {
            System.out.println("Error, formato de número no válido.");
            return true;
        }
    }
    public int obtenerNumero(){
        boolean on = true;
        String numero = "a";
        while (on){
            numero = scanner();
            on=verificarNumero(numero);
        }
        return Integer.parseInt(numero);
    }

    public boolean pesoValido(int peso){
        if (peso >= 150){
            System.out.println("Error. Peso muy alto para ser válido.");
            return false;
        } else if (peso <= 20) {
            System.out.println("Error. Peso muy bajo para ser válido.");
            return false;
        } else {
            return true;
        }
    }

    public boolean alturaValida(int altura){
        if (altura >= 170){
            System.out.println("Error. Altura muy alta para ser válida.");
            return false;
        } else if (altura <= 100) {
            System.out.println("Error. Altura muy para ser válida.");
            return false;
        } else {
            return true;
        }
    }



}

