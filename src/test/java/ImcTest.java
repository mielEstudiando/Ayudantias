import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ImcTest {

    @Test
    public void testverificarNumero(){
        String[] numero = {"2", "a", "2.4", "3,4", "2 8"};
        boolean[] resultado = {false, true, false, true, true};
        for (int i = 0; i<5; i++){
            Assertions.assertEquals(Imc.verificarNumero(numero[i]),resultado[i]);
        }
    }

    @Test
    public void testalturaValida(){
        int[] altura = {5, 100, 180, 200};
        boolean[] resultado = {false, true, true, false};
        for (int i = 0; i<4; i++) {
            Assertions.assertEquals(Imc.alturaValida(altura[i]), resultado[i]);
        }
    }

    @Test
    public void testpesoValido(){
        int[] peso = {5, 20, 150, 200};
        boolean[] resultado = {false, true, true, false};
            for (int i = 0; i<4; i++) {
                Assertions.assertEquals(Imc.pesoValido(peso[i]), resultado[i]);
            }
    }
}
