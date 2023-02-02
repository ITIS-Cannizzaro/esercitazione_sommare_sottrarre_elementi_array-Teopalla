import java.util.Scanner;

// Chiamare la classe col proprio cognome
public class pallavicini
{
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		while(true)
		{
			stampaMenu();
			int scelta = Integer.parseInt(in.nextLine());
			switch(scelta)
			{
				//aggiungere, togliere casi a seconda delle proprie scelte
				case 1:
					es1();
				break;
				case 2:
					
				break;
				case 3:
					//Inserire metodo statico
				break;
				default:
					System.out.println("Scelta errata, riprova!");

			}
		}
	}
	static void stampaMenu()
	{
		// Modificare il menù secondo le proprie scelte
		System.out.println("1 - Es n.1 - Titolo es. somma array pari");
		System.out.println("2 - Es n. * - Titolo es. *");
		System.out.println("3 - Es n. * - Titolo es. *");
		System.out.println("4 - Es n. * - Titolo es. *");
		System.out.println("5 - Es n. * - Titolo es. *");
	}
	
	
	static void es1()
	{
		
		System.out.println("inserisci quanti valori attribuire  all'array");
		int[]numeri=new int[Integer.parseInt(in.nextLine())];
		int differenza =0;
		for(int i=0;i<numeri.length;i++)
		{
			System.out.println("inserire valore" + i);
			numeri[i]=Integer.parseInt(in.nextLine());
		}
		differenza = numeri[1];
		for(int i=0;i<numeri.length;i++)
		{
			if (i%2==0 ||i==0)	
				differenza -= numeri[i];
		}
		System.out.println("differenza" + differenza);
	}
}

