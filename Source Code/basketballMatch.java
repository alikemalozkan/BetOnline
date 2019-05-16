
public class basketballMatch {
	
	private int numberOfFouls;
	private String mvpOfGame;
	Matches match;
	
	
	public basketballMatch(int matchCode, String teams, String score, String status, int numberOfFouls, String mvpOfGame) {
		this.numberOfFouls = numberOfFouls;
		this.mvpOfGame = mvpOfGame;
		match.setMatchCode(matchCode);
		match.setStatus(status);
		match.setTeams(teams);
		match.setScore(score);
	}
	
	
	//////////////////////////////////  DIFFERENT PARTS//////////////////////////////////////////////
	
	public void setNumberOfFouls(int numberOfFouls) {
		this.numberOfFouls = numberOfFouls;
	}
	public int getNumberOfFouls() {
		return this.numberOfFouls;
	}
	public void setMvpOfGame(String mvpOfGame) {
		this.mvpOfGame = mvpOfGame;
	}
	public String getMvpOfGame() {
		return this.mvpOfGame;
	}
	
}
