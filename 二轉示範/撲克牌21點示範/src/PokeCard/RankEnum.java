package PokeCard;

//每種牌數字的列舉，用來封裝分數以及印出字樣
public enum RankEnum {
	_A,_2,_3,_4,_5,_6,_7,_8,_9,_10,_J,_Q,_K;
	private int point;
	private RankEnum(){
		setPointAccordingToOrdinal();
	}
	public void setPointAccordingToOrdinal(){
		point = ordinal()+1;  
	}
	@Override
	public String toString() {
		return name().substring(1);
	}
	public int getPoint() {
		return point;
	}
	
}
