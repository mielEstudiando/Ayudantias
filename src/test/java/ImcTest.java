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
}
