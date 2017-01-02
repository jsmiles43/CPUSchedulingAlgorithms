import java.util.Collections;
import java.util.function.Predicate;

	public class FNS extends Simulation{
		
		public void processEvent(Event e) {
				//System.out.println(cpuFlag);
				clockTime = e.time;
				switch(e.type) {
				case ARRIVAL:
					
					PCB pcb = new PCB(e.burstTime, e.pcbid, e.arrivalTime, 0);
					PCBs.add(pcb);
					//System.out.println("here");
					getPCById(pcb.id).setState(PCB.State.READY);
					readyQueue.add(pcb);
					Collections.sort(readyQueue, new sortByBurst());
					
					break;
				case COMPLETION:
					//System.out.println(e.time - e.arrivalTime);
					//System.out.println(e.time - e.arrivalTime);
					turnAroundTimes.add(e.time - e.arrivalTime);
					
					Predicate<PCB> idFilter = p -> p.getID() == e.pcbid;
					PCBs.removeIf(idFilter);
					if (!readyQueue.isEmpty()) {
						
						PCB pcb1 = readyQueue.remove(0);
						//System.out.println(pcb1.id);
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



