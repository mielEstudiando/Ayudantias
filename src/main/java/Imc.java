import java.util.Scanner;
import java.util.ArrayList;

public class Imc {

    public static void main(String[] args) {
        System.out.println("Funcionando");
        menu();
    }

    public static ArrayList<Integer> alturas = new ArrayList<>();
    public static ArrayList<Integer> pesos = new ArrayList<>();

    private static String scanner(){
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
    public static int obtenerNumero(){
        boolean on = true;
        String numero = "a";
        while (on){
            numero = scanner();
            on=verificarNumero(numero);
        }
        return Integer.parseInt(numero);
    }

    public static boolean pesoValido(int peso){
        if (peso > 150){
            System.out.println("Error. Peso muy alto para ser válido.");
            return false;
        } else if (peso < 20) {
            System.out.println("Error. Peso muy bajo para ser válido.");
            return false;
        } else {
            return true;
        }
    }

    public static boolean alturaValida(int altura){
        if (altura > 180){
            System.out.println("Error. Altura muy alta para ser válida.");
            return false;
        } else if (altura < 100) {
            System.out.println("Error. Altura muy para ser válida.");
            return false;
        } else {
            return true;
        }
    }
    public static void menu(){
        boolean ON = true;
        while (ON) {
            System.out.println("Bienvenido a la calculadora de IMC para niños.");
            System.out.println("1. Calcular nuevo IMC.");
            System.out.println("2. Ver promedio de estaturas.");
            System.out.println("3. Ver promedio de pesos.");
            System.out.println("9. Salir.");
            String respuesta = scanner();
            switch (respuesta) {
                case "1" -> menuIMC();
                case "2" -> {
                    if (!alturas.isEmpty()) {
                        int promedioAltura = calcularPromedio(alturas);
                        System.out.println("La altura promedio es de " + promedioAltura + "cm");
                    } else {
                        System.out.println("No hay datos que promediar.");
                    }
                }
                case "3" -> {
                    if (!pesos.isEmpty()) {
                        int promedioPeso = calcularPromedio(pesos);
                        System.out.println("El peso promedio es de " + promedioPeso + "kg");
                    } else {
                        System.out.println("No hay datos que promediar.");
                    }
                }
                case "9" -> ON = false;
                default -> {
                }
            }
        }
    }

    public static float calcularIMC(int altura, int peso){
        float imc = peso / ((altura/100) ^ 2);
        float imcRedondeado = Math.round(imc*10);
        return imcRedondeado/10;
    }

    public static void menuIMC(){
        System.out.println("Ingrese el peso del niño (kg).");
        int peso = obtenerNumero();
        if (!pesoValido(peso)){
            return;
        }
        System.out.println("Ingrese la altura del niño (cm).");
        int altura = obtenerNumero();
        if (!alturaValida(altura)){
            return;
        }
        float IMC = calcularIMC(altura,peso);
        mostrarIMC(IMC);
        alturas.add(altura);
        pesos.add(peso);
    }

    public static void mostrarIMC(float IMC){
        if (IMC < 18.5){
            System.out.println("Con " + IMC + "  IMC, se encuentra bajo peso.");
        } else if (IMC < 25) {
            System.out.println("Con " + IMC + "  IMC, se encuentra en rango normal");
        } else if (IMC < 30) {
            System.out.println("Con " + IMC + "  IMC, se encuentra sobre peso.");
        } else {
            System.out.println("Con " + IMC + "  IMC, se encuentra en rango de obesidad.");
        }
    }

    public static int calcularPromedio(ArrayList<Integer> lista){
        int sum = 0;
        for (Integer elemento : lista){
            sum+=elemento;
        }
        return Math.round(sum /lista.size());
    }
}

