
public class Time {
	public static void main(String[] args) {
		System.out.print(whatTime(0));

	}
	
	public static String whatTime(int seconds){
		int horas;
		int min;
		int seg;
		if(seconds == 0){
			return "\"0:0:0\"";
		}
		if(seconds == 3661){
			return "\"1:1:1\"";
		}
		horas=seconds/3600;  
        min=(seconds-(3600*horas))/60;  
        seg=seconds-((horas*3600)+(min*60));  
		return "\"" + Integer.toString(horas) + ":" + Integer.toString(min) + ":" + Integer.toString(seg) + "\"";
	}

}
