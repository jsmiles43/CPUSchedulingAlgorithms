import java.util.Comparator;

public class PCB {
	public int id = 1;
	public int priority;
	public double burstTime;
	public double remainingTime;
	public State state;
	public double arrivalTime;
	public enum State {
		RUNNING, READY
	}
	public PCB(double _burstTime, int id, double _arrivalTime, int _priority) {
		this.priority = _priority;
		this.id = id;
		this.arrivalTime = _arrivalTime;
		this.burstTime = _burstTime;
		this.remainingTime = 0.0;
	}
	
	public int getID() {
		return this.id;
	}
	
	public void setState(State _state) {
		this.state = _state;
	}
}

class sortByBurst implements Comparator<PCB> {

	@Override
	public int compare(PCB o1, PCB o2) {
		return (int) (o1.burstTime - o2.burstTime);
	}
}

class sortByPriority implements Comparator<PCB> {

	@Override
	public int compare(PCB o1, PCB o2) {
		return o1.priority - o2.priority;
	}
}
