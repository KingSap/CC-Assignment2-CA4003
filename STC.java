import java.util.*;

class STC {
	private Map<String, Object> map;
	private Token type;
	private Type dataType;
	private Token id;
	private String scope;
	
	STC(){
		
	}
		
	STC(Token id, String scope) {
		this.id = id;
		this.scope = scope;
		this.map = new HashMap<String, Object>();
	}
		
	STC(Token id, String scope, Type dataType) {
		this.id = id;
		this.scope = scope;
		this.map = new HashMap<String, Object>();
		this.dataType = dataType; 
	}

	STC(Token id, Token type, String scope, Type dataType) {
		this.id = id;
		this.scope = scope;
		this.map = new HashMap<String, Object>();
		this.dataType = dataType; 
		this.type = type;
	}
	
	Type type() {
		return dataType;
	}
	
	Object get(String key) {
		return map.get(key);
	}
	
	Map getData() {
		return map;
	}
	
			
	Token getId() {
		return id;
	}
	
		String getScope() {
		return scope;
	}

	Token getType() {
		return type;
	}

	void addData(String key, Object obj) {
		map.put(key, obj);
	}
	
	void add(String key, Object value) {
		map.put(key, value);
	}
	
	public String toString() {
		return type + " " + id + " " + scope + " " + map;
	}

}
