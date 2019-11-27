package Java_20191127.step6;

//추상메서드를 만드는 순간 강제성이 생김 
public abstract class StopWatch {
	// 멤버변수에 대한 Encapsulation
	private long startTime;
	private long endTime;

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	} // 멤버변수 정보수집 위한 메서드

	public long getStartTime() {
		return startTime;
	}// 멤버변수 가져오기 위한 메서드

	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public abstract void run();
}
