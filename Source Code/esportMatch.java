
public class esportMatch {
	
	private String firstBlood;
	private String mvpOfGame;
	private String nextMap;
	Matches match;
	
	
	public esportMatch(int matchCode, String teams, String score, String status, String firstBlood, String mvpOfGame,String nextMap) {
		this.firstBlood = firstBlood;
		this.mvpOfGame = mvpOfGame;
		this.nextMap = nextMap;
		match.setMatchCode(matchCode);
		match.setStatus(status);
		match.setTeams(teams);
		match.setScore(score);
	}
	
	
	//////////////////////////////////  DIFFERENT PARTS//////////////////////////////////////////////
	
	public void setFirstBlood(String firstBlood) {
		this.firstBlood = firstBlood;
	}
	public String getFirstBlood() {
		return this.firstBlood;
	}
	public void setMvpOfGame(String mvpOfGame) {
		this.mvpOfGame = mvpOfGame;
	}
	public String getmvpOfGame() {
		return this.mvpOfGame;
	}
	public void setNextMap(String nextMap) {
		this.nextMap = nextMap;
	}
	public String getNextMap() {
		return this.nextMap;
	}
}
