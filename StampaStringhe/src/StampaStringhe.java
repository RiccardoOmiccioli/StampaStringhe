//import java.lang.String;
import java.util.Scanner;

public class StampaStringhe {
	
	private static void stampa( String StringaNome, String StringaCognome ) {
		
		if( StringaNome.isEmpty() ) System.out.println( "ERRORE: Nome non inserito" ); //StringaNome.isEmpty() restituisce 1 nel caso la stringa sia vuota
		System.out.println( StringaNome + " " + StringaCognome );		
		System.out.print( "Numero caratteri nome: " + StringaNome.length() + "\nNumero caratteri cognome: " + StringaCognome.length() + "\n");		
		System.out.println( "Prima lettera del nome: " + StringaNome.charAt(0) ); //Restituisce carattere in posizione 0
		System.out.println( "Prime tre lettere del nome: " + StringaNome.substring( 0, 3 ) ); //Restituisce caratteri in posizione 0, 1, 2 escludendo carattere in posizione 3
		System.out.println( "Lettere del nome restanti: " + StringaNome.substring( 3 ) ); //Restituisce caratteri dalla posizione 3 inclusa fino alla fine della stringa
		
		System.out.println( "Stampa nome tre lettere alla volta:" );
		for ( int i = 0; i < StringaNome.length(); i += 3 ) { //Assicura che la porzione considerata (da i a i +3) non superi la fine della stringa
			if ( i + 3 < StringaNome.length() )
			System.out.println( StringaNome.substring( i, i + 3 ) );
			else
			System.out.println( StringaNome.substring( i, StringaNome.length() ) );
		}
		
		if( StringaNome.indexOf( 'a' ) == -1 ) System.out.println( "Nessuna lettera 'a' trovata nel nome" ); 
		else System.out.println( "Lettera 'a' trovata nel nome in posizione: " + ( 1 + StringaNome.indexOf( 'a' ) ) ); //Restituisce indice della prima occorrenza del carattere a nella stringa
		if( StringaNome.indexOf( 'a', 5 ) == -1 ) System.out.println( "Nessuna lettera 'a' trovata nel nome dopo il quinto carattere" );
		else System.out.println( "Lettera 'a' dopo il quinto carattere trovata nel nome in posizione: " + ( 1 + StringaNome.indexOf( 'a', 5 ) ) ); //Restituisce indice della prima occorrenza del carattere a nella stringa a partire dal carattere della stringa in posizione 5
	
	}
	
	public static void main( String [] args ) {
		
		Scanner input = new Scanner( System.in );
		
		String nome = new String();
		String cognome = "Rossi";
	
		System.out.print( "Inserire nome: " );
		nome = input.nextLine();
		stampa( nome, cognome );
	
		input.close();
	}
	

}
