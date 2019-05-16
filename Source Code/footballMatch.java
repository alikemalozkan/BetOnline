
public class footballMatch {
	
	private int numberOfCorners;
	private int numberOfCards;
	Matches match;
	
	
	public footballMatch(int matchCode, String teams, String score, String status, int numberOfCorners, int numberOfCards) {
		this.numberOfCorners = numberOfCorners;
		this.numberOfCards = numberOfCards;
		match.setMatchCode(matchCode);
		match.setStatus(status);
		match.setTeams(teams);
		match.setScore(score);
	}
	
	
	//////////////////////////////////  DIFFERENT PARTS//////////////////////////////////////////////
	
	public void setNumberOfCards(int numberOfCards) {
		this.numberOfCards = numberOfCards;
	}
	public int getNumberOfCards() {
		return this.numberOfCards;
	}
	public void setNumberOfCorners(int numberOfCorners) {
		this.setNumberOfCorners(numberOfCorners);
	}
	public int getNumberOfCorners() {
		return this.numberOfCorners;
	}
	
}
