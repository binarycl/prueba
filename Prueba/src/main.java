public class main {
	public static void main(String[] args){
		try {
			String prueba = exceptions ();
			System.out.println(prueba);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String exceptions () throws Exception{
		String result = "";
		String v = null;
		try {
			try {
				result += "before";
				v.length();
				result += "after";
			} catch (NullPointerException e) {
				result += "catch";
				throw new RuntimeException();
			} finally{
				result += "finally";
				throw new Exception();
			}	
		} catch (Exception e) {
			result += "done";
		}
		return result;
	}
	
}