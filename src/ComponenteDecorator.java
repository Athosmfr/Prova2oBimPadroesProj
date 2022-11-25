
public abstract class ComponenteDecorator implements IComponente {

	// Classe abstrata que sera herdada pelos decoradores.
	
	public IComponente wrap;
	public String nomeComp;
	
	public ComponenteDecorator (IComponente wrap, String nomeComp) {
		this.wrap = wrap;
		this.nomeComp = nomeComp;
	}	
	
}
