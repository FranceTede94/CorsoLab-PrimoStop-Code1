package Calcoli;

public class Calcoli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Somma som = new Somma(30,40);
	Sottrazione sottr = new Sottrazione (50,30);
	Moltiplicazione molt = new Moltiplicazione(5,6);
	Divisione divi = new Divisione(8,4);
	
	som.setNumero1(10);
	som.setNumero2(20);
	
	sottr.setNumero1(100);
	sottr.setNumero2(10);
	
	molt.setNumero1(5);
	molt.setNumero2(10);
	
	divi.setNumero1(25);
	divi.setNumero2(5);
	
	
	
	
	System.out.println(som.getNumero1() + som.getNumero2());
	System.out.println(sottr.getNumero1() - sottr.getNumero2());
	System.out.println(molt.getNumero1() * molt.getNumero2());
	System.out.println(divi.getNumero1() / divi.getNumero2());

	}

}
