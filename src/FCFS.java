import java.util.Collections;
import java.util.function.Predicate;

public class FCFS extends Simulation{
	
	public void processEvent(Event e) {
			//System.out.println(cpuFlag);
			clockTime = e.time;
			switch(e.type) {
			case ARRIVAL:
				
				PCB pcb = new PCB(e.burstTime, e.pcbid, e.arrivalTime, 0);
				PCBs.add(pcb);
				if (!cpuFlag) {
					cpuFlag = true;
					pcb = this.getPCById(pcb.id);
					pcb.setState(PCB.State.RUNNING);
					//System.out.println(e.arrivalTime);
					Event completion = new Event(clockTime, Event.Type.COMPLETION,pcb.arrivalTime, pcb.burstTime, pcb.id, 0);
					//System.out.println("here");
					eventList.add(completion);
					Collections.sort(eventList); //sort event list by time using comparable object interface
				}	
				else {
					//System.out.println("here");
					this.getPCById(pcb.id).setState(PCB.State.READY);
					readyQueue.add(pcb);
				}	
				break;
			case COMPLETION:
				//System.out.println(e.time - e.arrivalTime);
				
				turnAroundTimes.add(e.time - e.arrivalTime);
				
				Predicate<PCB> idFilter = p -> p.getID() == e.pcbid;
				PCBs.removeIf(idFilter);
				if (!readyQueue.isEmpty()) {
					
					PCB pcb1 = readyQueue.remove(0);
					pcb1.setState(PCB.State.RUNNING);
					Event completion = new Event(clockTime, Event.Type.COMPLETION, pcb1.arrivalTime, pcb1.burstTime, pcb1.id, 0);
					eventList.add(completion);
					Collections.sort(eventList); //sort event list by time using comparable object interface
				}	
				else 
					cpuFlag = false;
				break;
			default:
				break;
			}
		}
}
