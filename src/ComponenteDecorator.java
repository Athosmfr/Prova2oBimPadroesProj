
public abstract class ComponenteDecorator implements IComponente {

	public IComponente wrap;
	
	public ComponenteDecorator (IComponente wrap) {
		this.wrap = wrap;
	}	
	
}
