package skunk;
//TODO: None -- should be fine
public class SkunkPlayer {
	
	private String name;
	private int playerGameScoreDiceTotal; 
	private int playerChipTotal; 
	
	//constructor
	public SkunkPlayer(final String inputName)	{
		setName(inputName);
	}
	
	// getters and setters
	public String getName() {
        return this.name;
    }
	private void setName(final String inputName) {
        this.name = inputName;
    }
    
	public int getPlayerDiceTotal() {
        return this.playerGameScoreDiceTotal;
    }
    public void setPlayerDiceTotal(final int num) {
        this.playerGameScoreDiceTotal = playerGameScoreDiceTotal + num;
    }
	public void resetDice() {
        this.playerGameScoreDiceTotal = 0;
	}
	
	public int getPlayerChipsTotal() {
        return this.playerChipTotal;
    }
    public void setPlayerChipsTotal(final int num){
        this.playerChipTotal = playerChipTotal + num;
    }
}