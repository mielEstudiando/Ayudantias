import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Prueba {

    public String[] palabras;
    public Boolean[] palindromo;
    public Double[][] notas;
    public Double[] promedio;
    public int [][] puntajes;
    public String [] ganador;
    public int [][] matriz;
    public int [][] matrizT;
    public String [] quizasletra;
    public  Boolean[] isletra;
    public int[] temperaturas;

    @Test
    public void palindromoTest() {
        palabras = new String[]{"oso", "melo", "melo olem", "ae"};
        palindromo = new Boolean[]{true, false, true, false};
        for (int i = 0; i < 4; i++) {
            Assertions.assertEquals(Act1.palindromoCheck(palabras[i]), palindromo[i]);
        }
    }
    @Test
    public void promedioTest(){
        notas = new Double[][] {{7d, 7d, 7d, 7d, 7d},{5d,7d,6d,4d,7d},{1d,1d,1d,1d,1d}};
        promedio = new Double[] {7d, 5.8d,1d};
        for (int j = 0; j < 3; j++){
            Assertions.assertEquals(Act1.Promediar(notas[j]),promedio[j]);
        }
    }
    @Test
    public void quienGanaTest(){
        puntajes = new int[][] {{20,20},{0,0},{21,21},{0,20},{0,23},{2,19},{20,0},{23,0},{19,0}};
        String[] respuestas= {"Empate.","Jugador 2 ganó.","Jugador 1 ganó."};
        ganador = new String[] {respuestas[0],respuestas[0],respuestas[0],respuestas[1],respuestas[2],
                respuestas[1],respuestas[2],respuestas[1],respuestas[2]};
        for (int k = 0; k<9; k++){
            Assertions.assertEquals(Act1.quienGana(puntajes[k]),ganador[k]);
        }
    }

    @Test
    public void matrizTraspuestaTest(){
        matriz=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        matrizT=new int[][] {{1,4,7}, {2,5,8}, {3,6,9}};
        for (int l=0; l<3; l++){
            Assertions.assertArrayEquals(Act1.matrizTraspuesta(matriz)[l],matrizT[l]);
        }
    }

    @Test
    public void esIntTest(){
        quizasletra=new String[] {"4", "ab", " "};
        isletra=new Boolean[] {false, true, false};
        for (int m=0; m<3; m++){
            Assertions.assertEquals(Act1.esLetra(quizasletra[m]),isletra[m]);
        }
    }
    @Test
    public void promedioTemperaturaTest(){
        temperaturas = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};
        Assertions.assertEquals(Act2.temperaturaPromedio(temperaturas),12.5);
    }

    @BeforeEach
    public void setUp() {
        temperaturas = new int[]{3, 5, 25, -8, 4};
    }
    @Test
    public void temperaturaMenorTest(){
        Assertions.assertEquals(Act2.temperaturaMenor(temperaturas),-8);
    } //esta prueba quedó obsoleta, pero funcionó bien
    @Test
    public void temperaturaMayorTest(){
        Assertions.assertEquals(Act2.mayorTemperatura(temperaturas),25);
    } //lo mismo con esta
    @Test
    public void promedioSemanaTest(){
        matriz = new int[][] {{24},{48},{72},{96},{120},{144},{168}};
        Assertions.assertEquals(Act2.promedioSemana(matriz),4);
    }
}
