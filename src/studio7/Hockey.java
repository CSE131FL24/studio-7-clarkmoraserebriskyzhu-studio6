package studio7;

public class Hockey {

	private int jerseyNumber;
	private String name;
	private boolean rightHanded;
	private int goals;
	private int assists;
	private int points;
	private int games;
	
	public Hockey(int jerseyNumber, String name, boolean rightHanded) {
		this.jerseyNumber = jerseyNumber;
		this.name = name;
		this.rightHanded = rightHanded;
		goals = 0;
		assists = 0;
		points = 0;
		games = 0;
	}
	
	public void Season(int g,int a) {
		goals += g;
		assists += a;
		points = goals + assists;
		games++;
	}


 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
