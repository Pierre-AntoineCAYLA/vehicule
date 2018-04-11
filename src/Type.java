
public enum Type {
	ROUTE(1, "Route"),
	VTT(2, "VTT"),
	VILLE(3, "Ville");
	
		int code;
		String label;
		
		Type(int id, String value){
			code=id;
			label=value;
		}
		public String toString() {
			return code+"-"+label;
		}
}
