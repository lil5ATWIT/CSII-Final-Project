package application;

public class GridBlock extends playerChar{
	private int side = 10; // 10 being placeholders simply for the hasXYZ methods to work
	private int windowX = 0;
	private int windowY = 0;
	private char enemyType = '1';
	private int playerType = 10;
	private int obstacleType = 10;
	private int enemyLevel = 1;
	private boolean battleBlock;
	private playerChar enemy;
	private int displayIndex;

	public GridBlock() {

	}
	
	public void setDisplayIndex(int i) {
		this.displayIndex = i;
	}
	
	public int getDisplayIndex() {
		return displayIndex;
	}
	
	public void setEnemy(String name, int r, int c) {
		this.enemy = new Enemy(name, r, c);
	}
	
	public void setEnemy(playerChar empty) {
		this.enemy = empty;
	}
	

	public void setSide(int side) { // sets data
		this.side = side;
	}

	public void setEnemy(char enemy) {
		this.enemyType = enemy;
	}

	public void setPlayer(int player) {
		this.playerType = player;
	}

	public void setObstacle(int obstacle) {
		this.obstacleType = obstacle;
	}

	public void setLevel(int level) {
		this.enemyLevel = level;
	}
	
	public void setX(int x) {
		this.windowX = x;
	}
	
	public void setY(int y) {
		this.windowY = y;
	}

	public int getSide() { // retrieves data
		return side;
	}

	public char getEnemy() {
		return enemyType;
	}
	
	public playerChar getEntity() {
		return enemy;
	}

	public int getPlayer() {
		return playerType;
	}

	public int getObstacle() {
		return obstacleType;
	}

	public int getLevel() {
		return enemyLevel;
	}
	
	public int getX() {
		return windowX;
	}
	
	public int getY() {
		return windowY;
	}

	public boolean hasPlayer() {
		if (playerType != 10) {
			return true;
		} else {
			return false;
		}
	}

	public boolean hasEnemy() {
		if (enemyType != '1') {
			return true;
		} else {
			return false;
		}
	}

	public boolean hasObstacle() {
		if (obstacleType != 10) {
			return true;
		} else {
			return false;
		}
	}

	public void setBlock(boolean bType) {
		this.battleBlock = bType;
	}

	public boolean isBattleBlock() {
		if (side == 10) {
			return false;
		} else {
			return true;
		}
	}

	public boolean isMoveable() {
		if (this.hasEnemy() == true || this.hasPlayer() == true || this.hasObstacle() == true) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		String bType = side == 1 ? (playerType != 10 ? Integer.toString(playerType) : "B")
				: (enemyType != '1' ? Character.toString(enemyType) : "B");

		if (obstacleType != 10)
			bType = "6";

		String level = enemyLevel != 10 ? Integer.toString(enemyLevel) : "";

		return String.format("%d%s%s", side, bType, level);
	}
}
