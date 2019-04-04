
public abstract class Views {

	RecursoDeMidia midia;

	public Views(RecursoDeMidia m) {
		this.midia = m;
	}

	public void apresentarMidia(String s) {
		midia.apresentarMidia(s);
	}
	
	public abstract void mostrar();

}
