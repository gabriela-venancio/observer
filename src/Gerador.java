import java.util.ArrayList;
import java.util.Random;

public class Observer {
	
	Random r = new Random();
	
	int numeros;
	public ArrayList<Observador> observadores = new ArrayList<>();
	
	
	
	
	
	public void adicionaNumero () {
		int n = r.nextInt(1000);
		notificaObservador(n);
	}
	
	public void addObservador(Observador o) {
		
		if(!observadores.contains(o)) {
			observadores.add(o);
		}
	}
	
	
	public void removeObservador(Observador o) {
		
		observadores.remove(o);
	}
	
	public void notificaObservador(int n) {
		for(Observador o : observadores) {
			o.novosNumeros(n);
		}
	}
	
	
}
