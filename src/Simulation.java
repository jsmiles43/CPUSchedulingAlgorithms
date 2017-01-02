import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

 public class Simulation {
	 public List<PCB> PCBs;
	 public List<Event> eventList;
	 public boolean cpuFlag;
	 public List<PCB> readyQueue;
	 public double clockTime;
	 public List<Double> waitTimes;
	 public List<Double> turnAroundTimes;
	 public double averageTurnAroundTime;
	 public double averageWaitTime;
	 public double quantum;
	 public Simulation() {
		 this.PCBs = new ArrayList<PCB>();
		 this.eventList = new ArrayList<Event>();
		 this.cpuFlag = false;	//true for occupied false for not occupied
		 this.readyQueue = new ArrayList<PCB>();
		 this.turnAroundTimes = new ArrayList<Double>();
		 this.quantum = 1.0;
	 }
	 
	 public void processEvent(Event e) {}
	 public PCB getPCById(Integer Id) {
			Predicate<PCB> p = pcb -> pcb.getID() == Id; 
			PCB pcb = this.PCBs.stream().filter(p).findFirst().get();
			return pcb;
	 }
	 public double computeAverageTime(List<Double> times) {
			double timeAverage = 0.0;
			for (double time: times) {
				timeAverage += time;
			}
			return timeAverage/times.size();
	 }
	 
}
 
 

