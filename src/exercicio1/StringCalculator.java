package exercicio1;

public class StringCalculator {

	public String add(String string) {

		switch(string){
			
			case "0":{
				
				return "0";
			}
			case "1":{
				
				return "1";
			}
			case "":{
				
				return "0";
			}
		}		
		
		return null;
	}
}
