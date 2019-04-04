import java.util.Locale;
import java.util.Scanner;

public class Usuario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		Views view = new LongForm(new Video());
		view.mostrar();
		
		System.out.println();
		
		view = new ShortForm(new Imagem());
		view.mostrar();

	}

}
