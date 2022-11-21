
public abstract class ComponenteDecorator implements IComponente {

	public IComponente wrap;
	public String nomeComp;
	
	public ComponenteDecorator (IComponente wrap, String nomeComp) {
		this.wrap = wrap;
		this.nomeComp = nomeComp;
	}	
	
}
