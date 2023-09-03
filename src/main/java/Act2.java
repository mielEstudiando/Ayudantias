import java.util.Random;
import java.util.Scanner;

public class Act2 {

    public static String[] diasSemana = new String[]{"lunes", "martes", "miercoles", "jueves",
            "viernes", "sábado", "domingo"};
    private static int temperaturaRandom(int sup, int inf){
        Random random = new Random();
        return random.nextInt(sup-inf+1) + inf;
    }
    private static void llenarTemperatura(int sup, int inf, int hora, int[][] matriz){
        for (int i = hora; i < (hora+ 3); i++){
            for (int j =0; j < 7;j++){
                matriz[j][i]=temperaturaRandom(sup,inf);
            }
        }
    }
    public static int[][] llenarClima(){
        int [][] climasemana = new int[7][24];
        llenarTemperatura(2,-3,0, climasemana);
        llenarTemperatura(4,2,3, climasemana);
        llenarTemperatura(6,4,6, climasemana);
        llenarTemperatura(10,6,9, climasemana);
        llenarTemperatura(15,10,12, climasemana);
        llenarTemperatura(25,10,15, climasemana);
        llenarTemperatura(10,6,18, climasemana);
        llenarTemperatura(6,2,21, climasemana);
        return climasemana;
    }

    public static double temperaturaPromedio(int[] temperaturas){
        double promedio = 0;
        for (int i :temperaturas){
            promedio+= i;
        }
        return promedio/24;
    }
    public static double promedioSemana(int[][] semana){
        double promedioS = 0;
        for (int[] fila : semana){
            promedioS+= temperaturaPromedio(fila);
        }
        return promedioS/7;
    }

    public static void printPromedioSemana(int[][] semana){
        double promedio= promedioSemana(semana);
        System.out.println("El promedio de temperatura de esta semana fue: ");
        System.out.println(promedio);
    }
    public static int[] mayorTemperatura(int[] temperaturas){
        int temperaturamayor=0;
        int hora=0;
        for (int i=0; i<24; i++){
            if (temperaturas[i] > temperaturamayor){
                temperaturamayor=temperaturas[i];
                hora=i;
            }
        }
        return new int[]{temperaturamayor, hora};
    }
    public static int[] temperaturaMenor(int [] temperaturas){
        int temperaturamenor=25;
        int hora=0;
        for (int i=0; i<24; i++){
            if (temperaturas[i] < temperaturamenor){
                temperaturamenor=temperaturas[i];
                hora=i;
            }
        }
        return new int[]{temperaturamenor, hora};
    }
    public static void diaMas(boolean a, int [][]matriz) {
        double max = 0;
        double min = 25;
        int diaa = 0;
        for (int dia = 0; dia < 7; dia++) {
            double temp = temperaturaPromedio(matriz[dia]);
            if (a && temp > max) {
                max = temp;
                diaa = dia;
            } else if (temp < min) {
                    min = temp;
            diaa = dia;
            }
        }
        if (a){
            System.out.println("Día más cálido fue el "+diasSemana[diaa]+ " con un promedio de " + max + " grados.");
        } else {
            System.out.println("Día más frío fue el "+diasSemana[diaa]+ " con un promedio de " + min + " grados.");
        }
    }
    public static void mayorTemp(int[][] matriz){
        int temperaturamayor=0;
        int dia=0;
        int hora=0;
        for (int i=0; i<7; i++){
            int[] temp= mayorTemperatura(matriz[i]);
            if (temp[0] > temperaturamayor){
                temperaturamayor=temp[0];
                hora=temp[1];
                dia=i;
            }
        }
        System.out.println("La temperatura mayor se registró el día " + diasSemana[dia]);
        System.out.println("Con un total de " + temperaturamayor + " grados a las " + hora + " horas.");
    }
    public static void menorTemp(int[][] matriz){
        int temperaturamenor=25;
        int dia=0;
        int hora=0;
        for (int i=0; i<7; i++){
            int[] temp= temperaturaMenor(matriz[i]);
            if (temp[0] < temperaturamenor){
                temperaturamenor=temp[0];
                hora=temp[1];
                dia=i;
            }
        }
        System.out.println("La temperatura menor se registró el día " + diasSemana[dia]);
        System.out.println("Con un total de " + temperaturamenor + " grados a las " + hora + " horas.");
    }
    public static boolean accion(int[][] matriz){
        Scanner scanner = new Scanner(System.in);
        String resp = scanner.nextLine();
        System.out.println(resp);
        switch (resp) {
            case "1" -> diaMas(true, matriz);
            case "2" -> diaMas(false, matriz);
            case "3" -> menorTemp(matriz);
            case "4" -> mayorTemp(matriz);
            case "5" -> printPromedioSemana(matriz);
            case "9" -> {
                return false;
            }
        }
        return true;
    }
    public static void menu() {
        int[][] climasemana= llenarClima();
        boolean on= true;
        while (on){
            System.out.println("1. Ver día más caluroso");
            System.out.println("2. Ver día más frío");
            System.out.println("3. Ver temperatura más baja");
            System.out.println("4. Ver temperatura más alta");
            System.out.println("5. Promedio temperatura semanal");
            System.out.println("9. Salir");
            on=accion(climasemana);
        }
    }

    public static void main(String[] args) {
        menu();
    }
}

