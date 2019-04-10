public class ScoreManager {

	   protected static int score = 0;
	   protected static int bonusScorePerKill = 10;
	   
	   public ScoreManager() { }
	   
	   public static void addKilledEnemyScore( ) {
		   
		   score += bonusScorePerKill;
	   
	   }
	   
	   public static void setBonusScore(int b) {
		   
		   bonusScorePerKill = b;
	   
	   }
	   
	   
	   public static   int getScore() {
		   return score;
	   }
	   
	   
}
