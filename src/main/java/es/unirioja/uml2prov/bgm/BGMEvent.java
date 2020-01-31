
package es.unirioja.uml2prov.bgm;

import java.util.EventObject;

/**
 * @author carlos
 *
 */
public class BGMEvent extends EventObject {
	
	@Override
	public String toString() {
		return "BGMEvent [executionID=" + executionID + ", className=" + className + ", executionIdMethod="
				+ executionIdMethod + ", varName=" + varName + ", value=" + value + ", identifier=" + identifier
				+ ", type=" + type + ", state=" + state + "]";
	}

	
	//para los elementos
	private String executionID;
	private String className;
	private String executionIdMethod;
	
	/**
	 * @param executionIdMethod
	 */
	public void setExecutionIdMethod(String executionIdMethod) {
		this.executionIdMethod = executionIdMethod;
	}

	private String varName;

	private String value;
	
	//para valores
	private String identifier;
	private String type;
	private String state;

	
	//para elementos
	/**
	 * @param source
	 * @param executionID
	 * @param className
	 * @param executionIdMethod
	 * @param varName
	 * @param value
	 */
	public BGMEvent(Object source, String executionID, String className, String executionIdMethod, String varName,String value) {
		super(source);
		this.executionID = executionID;
		this.className = className;
		this.executionIdMethod = executionIdMethod;
		this.varName = varName;
		this.value = value;
	}
	
	
	//para valores de elementos
	/**
	 * @param source
	 * @param executionID
	 * @param value
	 * @param identifier
	 * @param type
	 */
	public BGMEvent(Object source, String executionID, String value, String identifier, String type) {
		super(source);
		this.executionID = executionID;
		this.value = value;
		this.identifier = identifier;
		this.type = type;
	}
	
	//para inicio y final metodo
	/**
	 * @param source
	 * @param executionID
	 * @param className
	 * @param executionIdMethod
	 */
	public BGMEvent(Object source, String executionID, String className, String executionIdMethod) {
		super(source);
		this.executionID = executionID;
		this.className = className;
		this.executionIdMethod = executionIdMethod;
	}
	
	/**
	 * @param varName
	 */
	public void setVarName(String varName) {
		this.varName = varName;
	}


	/**
	 * @return
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * @return
	 */
	public String getType() {
		return type;
	}

	
	/**
	 * @return
	 */
	public String getExecutionID() {
		return executionID;
	}

	/**
	 * @return
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * @return
	 */
	public String getExecutionIdMethod() {
		return executionIdMethod;
	}

	/**
	 * @return
	 */
	public String getVarName() {
		return varName;
	}

	/**
	 * @return
	 */
	public String getValue() {
		return value;
	}


	/**
	 * @return
	 */
	public String getState() {
		return state;
	}


	/**
	 * @param state
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	

}


