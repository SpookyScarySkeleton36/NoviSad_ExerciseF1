public class Frame {
	private int firstThrow;
	private int secondThrow;
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	public int getFirstThrow() {
		return firstThrow;
	}

	public int getSecondThrow() {
		return secondThrow;
	}

	//returns the score of a single frame
	public int score(){
		//to be implemented
		return firstThrow + secondThrow;
		//return 0;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		//to be implemented
		if(firstThrow == 10){
			return true;
		}else{
			return false;
		}
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		//to be implemented
		if((firstThrow + secondThrow) == 10){
			return true;
		}else{
			return false;
		}
	}

	public void setFirstThrow(int firstThrow) {
		this.firstThrow = firstThrow;
	}

	public void setSecondThrow(int secondThrow) {
		this.secondThrow = secondThrow;
	}
}
