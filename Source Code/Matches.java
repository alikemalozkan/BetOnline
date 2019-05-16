
public class Matches {
	
	private int matchCode;
	private String teams;
	private String score;
	private String status;
	
	public Matches(int matchCode, String teams,String score,String status){
		this.matchCode = matchCode;
		this.teams = teams;
		this.score = score;
		this.status = status;
	}
	
	public void setMatchCode(int matchCode) {
		this.matchCode = matchCode;
	}
	public int getMatchCode() {
		return this.matchCode;
	}
	public void setTeams(String teams){
		this.teams = teams;
	}
	public String getTeams(){
		return this.teams;
	}
	
	public void setScore(String score){
		this.score = score;
	}
	public String getScore(){
		return this.score;
	}
	public void setStatus(String status){
		this.status = status;
	}
	public String getStatus(){
		return this.status;
	}
	

}
