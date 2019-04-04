
public abstract class View {

	RecursoDeMidia midia;

	public View(RecursoDeMidia m) {
		this.midia = m;
	}

	public void apresentarMidia(String s) {
		midia.apresentarMidia(s);
	}
	
	public abstract void mostrar();

}
