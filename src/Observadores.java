import java.util.ArrayList;

public class Observadores implements Observador {

	@Override
	public void novosNumeros(int valor) {

		System.out.println("fui notificado!!!");
		
		if (valor%2==0) {
			System.out.println(valor+" é Par");
			
		} else{
			System.out.println(valor+" é Impar");
		}
	}

}
