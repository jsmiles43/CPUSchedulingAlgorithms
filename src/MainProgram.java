
public class MainProgram {
	
	public static void main(String[] args) {
	
	System.out.println("___5.3_TAT_for_FCFS______________");
	Simulation FCFS = new FCFS();
	FCFS.eventList.add(new Event(0, Event.Type.ARRIVAL, 0.0, 8, 1, 0));
	FCFS.eventList.add(new Event(0, Event.Type.ARRIVAL, 0.4, 4, 2, 0));
	FCFS.eventList.add(new Event(0, Event.Type.ARRIVAL, 1.0, 1, 3, 0));
	//System.out.println(eventList.size());
	while(FCFS.eventList.size() != 0) {
		Event e = FCFS.eventList.remove(0);
		//System.out.println(e.arrivalTime);	
		if (e.type == Event.Type.ARRIVAL)    //the variable time for an arrival event is the start time for that event's process
				e.time = e.arrivalTime;
			//System.out.println("Process " + e.pcbid);
			//System.out.println(e.type);
			//System.out.println(eventList.size());
			FCFS.processEvent(e);
			//System.out.println(FCFS.clockTime);
		}
	FCFS.averageTurnAroundTime = FCFS.computeAverageTime(FCFS.turnAroundTimes);
	System.out.println(FCFS.averageTurnAroundTime);
	System.out.println("____5.3_TAT_for_SJF_____");
	Simulation SJF = new SJF();
	SJF.eventList.add(new Event(0, Event.Type.ARRIVAL, 0.0, 8, 1, 0));
	SJF.eventList.add(new Event(0, Event.Type.ARRIVAL, 0.4, 4, 2, 0));
	SJF.eventList.add(new Event(0, Event.Type.ARRIVAL, 1.0, 1, 3, 0));
	while(SJF.eventList.size() != 0) {
		Event e = SJF.eventList.remove(0);
		//System.out.println(e.arrivalTime);	
		if (e.type == Event.Type.ARRIVAL)    //the variable time for an arrival event is the start time for that event's process
				e.time = e.arrivalTime;
			//System.out.println("Process " + e.pcbid);
			//System.out.println(e.type);
			//System.out.println(eventList.size());
			SJF.processEvent(e);
			//System.out.println(FCFS.clockTime);
		}
	SJF.averageTurnAroundTime = SJF.computeAverageTime(SJF.turnAroundTimes);
	System.out.println(SJF.averageTurnAroundTime);
	
	System.out.println("___5.3__TAT__FNS_________");
	Simulation FNS = new FNS();
	FNS.eventList.add(new Event(0, Event.Type.ARRIVAL, 0.0, 8, 1, 0));
	FNS.eventList.add(new Event(0, Event.Type.ARRIVAL, 0.4, 4, 2, 0));
	FNS.eventList.add(new Event(0, Event.Type.ARRIVAL, 1.0, 1, 3, 0));
	FNS.eventList.add(new Event(2, Event.Type.COMPLETION, 1.0, 1, 3, 0));
	while(FNS.eventList.size() != 0) {
		Event e = FNS.eventList.remove(0);
		//System.out.println(e.arrivalTime);	
		if (e.type == Event.Type.ARRIVAL)    //the variable time for an arrival event is the start time for that event's process
				e.time = e.arrivalTime + 1;
			//System.out.println("Process " + e.pcbid);
			//System.out.println(e.type);
			//System.out.println(eventList.size());
			FNS.processEvent(e);
			//System.out.println(FNS.clockTime);
		}
	FNS.averageTurnAroundTime = FNS.computeAverageTime(FNS.turnAroundTimes);
	System.out.println(FNS.averageTurnAroundTime);
	System.out.println("___5.12__TAT____FCFS___________");
	Simulation FCFS2 = new FCFS();
	FCFS2.eventList.add(new Event(0, Event.Type.ARRIVAL, 0.0, 10, 1, 0));
	FCFS2.eventList.add(new Event(0, Event.Type.ARRIVAL, 0.0, 1, 2, 0));
	FCFS2.eventList.add(new Event(0, Event.Type.ARRIVAL, 0.0, 2, 3, 0));
	FCFS2.eventList.add(new Event(0, Event.Type.ARRIVAL, 0.0, 1, 4, 0));
	FCFS2.eventList.add(new Event(0, Event.Type.ARRIVAL, 0.0, 5, 5, 0));
	//System.out.println(eventList.size());
	while(FCFS2.eventList.size() != 0) {
		Event e = FCFS2.eventList.remove(0);
		//System.out.println(e.arrivalTime);	
		if (e.type == Event.Type.ARRIVAL)    //the variable time for an arrival event is the start time for that event's process
				e.time = e.arrivalTime;
			//System.out.println("Process " + e.pcbid);
			//System.out.println(e.type);
			//System.out.println(eventList.size());
			FCFS2.processEvent(e);
			//System.out.println(FCFS.clockTime);
		}
	for (double time: FCFS2.turnAroundTimes) 
		System.out.println(time);
	FCFS2.averageTurnAroundTime = FCFS2.computeAverageTime(FCFS2.turnAroundTimes);
	System.out.println("Average:" + FCFS2.averageTurnAroundTime);	
	
	System.out.println("___5.12__TAT____SJF___________");
	Simulation SJF2 = new SJF();
	SJF2.eventList.add(new Event(0, Event.Type.ARRIVAL, 0.0, 1, 2, 0));
	SJF2.eventList.add(new Event(0, Event.Type.ARRIVAL, 0.0, 2, 3, 0));
	SJF2.eventList.add(new Event(0, Event.Type.ARRIVAL, 0.0, 1, 4, 0));
	SJF2.eventList.add(new Event(0, Event.Type.ARRIVAL, 0.0, 5, 5, 0));
	SJF2.eventList.add(new Event(0, Event.Type.ARRIVAL, 0.0, 10, 1, 0));
	//System.out.println(eventList.size());
	while(SJF2.eventList.size() != 0) {
		Event e = SJF2.eventList.remove(0);
		//System.out.println(e.arrivalTime);	
		if (e.type == Event.Type.ARRIVAL)    //the variable time for an arrival event is the start time for that event's process
				e.time = e.arrivalTime;
			//System.out.println("Process " + e.pcbid);
			//System.out.println(e.type);
			//System.out.println(eventList.size());
			SJF2.processEvent(e);
			//System.out.println(FCFS.clockTime);
		}
	for (double time: SJF2.turnAroundTimes) 
		System.out.println(time);
	SJF2.averageTurnAroundTime = SJF2.computeAverageTime(SJF2.turnAroundTimes);
	System.out.println(SJF2.averageTurnAroundTime);
		
	System.out.println("___5.12__TAT____NPP___________");
	Simulation NPP = new NPP();
	NPP.eventList.add(new Event(0, Event.Type.ARRIVAL, 0.0, 1, 2, 1));
	NPP.eventList.add(new Event(0, Event.Type.ARRIVAL, 0.0, 10, 1, 3));
	NPP.eventList.add(new Event(0, Event.Type.ARRIVAL, 0.0, 2, 3, 3));
	NPP.eventList.add(new Event(0, Event.Type.ARRIVAL, 0.0, 1, 4, 4));
	NPP.eventList.add(new Event(0, Event.Type.ARRIVAL, 0.0, 5, 5, 2));
	//System.out.println(eventList.size());
	while(NPP.eventList.size() != 0) {
		Event e = NPP.eventList.remove(0);
		//System.out.println(e.arrivalTime);	
		if (e.type == Event.Type.ARRIVAL)    //the variable time for an arrival event is the start time for that event's process
				e.time = e.arrivalTime;
			//System.out.println("Process " + e.pcbid);
			//System.out.println(e.type);
			//System.out.println(eventList.size());
			NPP.processEvent(e);
			//System.out.println(FCFS.clockTime);
		}
	for (double time: NPP.turnAroundTimes) 
		System.out.println(time);
	NPP.averageTurnAroundTime = NPP.computeAverageTime(NPP.turnAroundTimes);
	System.out.println(NPP.averageTurnAroundTime);	
		
	System.out.println("___5.12__TAT____RR___________");
	Simulation RR = new RR();
	RR.eventList.add(new Event(0, Event.Type.ARRIVAL, 0.0, 10, 1, 3));
	RR.eventList.add(new Event(0, Event.Type.ARRIVAL, 0.0, 1, 2, 1));
	RR.eventList.add(new Event(0, Event.Type.ARRIVAL, 0.0, 2, 3, 3));
	RR.eventList.add(new Event(0, Event.Type.ARRIVAL, 0.0, 1, 4, 4));
	RR.eventList.add(new Event(0, Event.Type.ARRIVAL, 0.0, 5, 5, 2));
	//System.out.println(eventList.size());
	while(RR.eventList.size() != 0) {
		Event e = RR.eventList.remove(0);
		//System.out.println(e.arrivalTime);	
		if (e.type == Event.Type.ARRIVAL)    //the variable time for an arrival event is the start time for that event's process
				e.time = e.arrivalTime;
			//System.out.println("Process " + e.pcbid);
			//System.out.println(e.type);
			//System.out.println(eventList.size());
			RR.processEvent(e);
			//System.out.println(FCFS.clockTime);
		}
	for (double time: RR.turnAroundTimes) 
		System.out.println(time);
	RR.averageTurnAroundTime = RR.computeAverageTime(RR.turnAroundTimes);
	System.out.println(RR.averageTurnAroundTime);	
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
