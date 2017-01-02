

public class Event implements Comparable<Event> {       //the event class with types person, arrival, boarder, and dummy for the initial event 
	public int pcbid;
	public int priority;
	public double time;	//with clock = 0
	public Type type;
	static int eventNumber = 0;  
	public double arrivalTime;
	public double burstTime;
	public enum Type {
		ARRIVAL, COMPLETION
	}
	
	
	
	public Event(double clockTime, Type type, double _arrivalTime, double _burstTime, int _pcbid, int _priority) {
		this.priority = _priority;
		this.pcbid = _pcbid;
		this.burstTime = _burstTime;
		this.type = type;
		this.arrivalTime = _arrivalTime;
		if (this.type == Event.Type.COMPLETION)
			this.time = clockTime + _burstTime;
		eventNumber++;
	}


	public int compareTo(Event o1) {
		return (int) (this.time - o1.time);
	};
}
