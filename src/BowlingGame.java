import java.util.ArrayList;
import java.util.List;

// Before you commit and push write your student ID and finish time here.
// Finish time:
// Student ID: IT40/2015

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	private int result;
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame){
		//to be implemented
		frames.add(frame);
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) throws BowlingException {
		//to be implemented
		
		for(int i = 0; i < frames.size(); i++){
			if(frames.get(i).isSpare() == true){
				throw new BowlingException();			
			}
			else if(frames.get(i).isStrike() == true){
				throw new BowlingException();
			}else{
				
			}
		}
	}
	public int bonuses(){
		int bonus;
		for(int i =0; i < frames.size(); i++){
			if(frames.get(i).isSpare() == true){
				bonus=  frames.get(i+1).getFirstThrow();
				return bonus;
			}
			else if(frames.get(i).isStrike() == true){
				bonus = frames.get(i+1).getFirstThrow() + frames.get(i+1).getSecondThrow() + 
						frames.get(i+2).getFirstThrow() + frames.get(i+2).getSecondThrow();
				return bonus;
				
			}
		}
		return 0;
		
	}
	
	// Returns the game score
	public int score(){
		//to be implemented: should return game score
		for(int i =0; i < frames.size(); i++){
			if(frames.get(i).isSpare() == true || frames.get(i).isStrike() == true){
				return result += frames.get(i).score() + bonuses();
				
			}
			else{
				return result += frames.get(i).score();
			}

		}

		return 0;
	}

}
