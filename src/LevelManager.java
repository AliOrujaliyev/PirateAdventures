import java.util.ArrayList;

public class LevelManager {
	 ArrayList<WaveManager> wave;
	 int count = 0;
	 
	 
	 public LevelManager() {
		 wave = new ArrayList<WaveManager>();
	 }
	 
	 public void addWave( int number1, int number2, int number3 )
	{
		 WaveManager newWave = new WaveManager();
		 wave.add(newWave);
		for ( int i = 0; i < number1; i++)
		{
			 newWave.addCreep(3, (float)(20 + i * 60), 170, 1);
		}
		for ( int i = 0; i < number2; i++)
		{
			 newWave.addCreep(4, (float)( 20 + i * 80), 120, 2);
		}
		for ( int i = 0; i < number3; i++)
		{
			 newWave.addCreep(5, (float)( 20 + i * 120), 40, 3);
		}
		
	}
	 
	 public void addBossWave()
	 {
		 WaveManager newWave = new WaveManager();
		 wave.add(newWave);
		 newWave.addCreep( 4, (float)50, 40, 4);
	 }
	 
	 public void levelUpdate() {
		 if ( wave.get(0).getCreepSize() == 0  )
		 {
			 wave.remove(0);
		 }
	 }
	 
	 public int getSize() {
		 return wave.size();
	 }
	 
	 public int getWaveSize() {
		 return wave.size();
	 }
	 
	 public WaveManager getWave( int i ) {
		 return wave.get(i);
	 }
	 
}
