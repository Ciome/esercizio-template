
public abstract class AbstractPanino {
	
	public final void preparaPanino() {
		tagliaPanino();
		mettiCondimento();
		mettiSalsa();
		consegnaPanino();
	}
	
	protected void tagliaPanino() {
		System.out.println("taglia il pane"); 
	}
	
	protected abstract void mettiCondimento();
	protected abstract void mettiSalsa();
	protected void consegnaPanino() {
		System.out.println("consegnato il panino");
	}
}
