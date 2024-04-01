package PatronStrategy;

import PatronStrategy.AntivirusAvanzado;


public class AppSt {
	
	public static void main(String[] args) {
		Contexto contexto = new Contexto(new AntivirusAvanzado());
		contexto.ejecutar();
	}

}
