package es.unirioja.uml2prov.bgm;

public interface BGMEventListener {
	
	/**
	 * <p>
	 * Manages information about the collection of a provenance value associated with a statement-level variable, i.e., a type of variable that occurs in an optional identifier position, or in an attribute-value pair
	 * </p>
	 * @param e The BGMEvent
	 */
	public void newValueBinding(BGMEvent e);
	/**
	 * <p>Manages information about the collection of a provenance value associated with a group variable, i.e., a type of variable that occurs in a mandatory identifier position</p>
	 * @param e The BGMEvent
	 */
	public void newBinding(BGMEvent e);
	/**
	 * <p>Manages information about the start of an operation execution.</p>
	 * @param e The BGMEvent
	 */
	public void operationStart(BGMEvent e);
	/**
	 * <p>Manages information about the end of an operation execution.</p>
	 * @param e The BGMEvent
	 */
	public void operationEnd(BGMEvent e);
}


