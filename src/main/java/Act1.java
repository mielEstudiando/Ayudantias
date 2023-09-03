public class Act1 {

    public static boolean palindromoCheck(String palabraIngresada) {
        palabraIngresada = palabraIngresada.replace(" ", "");
        StringBuilder stringBuilder = new StringBuilder(palabraIngresada);
        String palabraInvertida = stringBuilder.reverse().toString();
        return palabraIngresada.equalsIgnoreCase(palabraInvertida);
    }
    public static double Promediar(Double[] notas) {
        double [] ponderacionNotas = {0.25, 0.25, 0.25, 0.15, 0.10};
        double promedio = 0;
        for (int i = 0; i < notas.length; i++) {
            promedio += (notas[i] * ponderacionNotas[i]);
        }
        return promedio;
    }
    public static String quienGana(int [] puntajes) {
        int jugador1 = 20 - puntajes[0];
        int jugador2 = 20 - puntajes[1];
        if(((jugador1 < 0) && (jugador2 < 0)) || (jugador1 == jugador2)) {
            return "Empate.";
        } else if(((jugador1 < 0) || (jugador2 < jugador1)) && (jugador2 >= 0)) {
            return "Jugador 2 ganó.";
        } else {
            return "Jugador 1 ganó.";
        }
    }
    public static int[][] matrizTraspuesta(int[][] a) {
        int[][] t = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                t[j][i] = a[i][j];
            }
        }
        return t;
    }
    public static boolean esLetra(String palabraIngresada) {
        for (int i = 0; i < palabraIngresada.length(); i++) {
            if (Character.isDigit(palabraIngresada.charAt(i)) ||
                    palabraIngresada.isBlank()) {
                return false;
            }
        }
        return true;
    }
}
