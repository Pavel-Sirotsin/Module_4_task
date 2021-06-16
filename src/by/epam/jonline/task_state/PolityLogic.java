package by.epam.jonline.task_state;

import java.util.ArrayList;
import java.util.List;

public class PolityLogic {
	public String printTheCapital(Polity polity){
		return polity.getTheCapital();
	}
	
	public int printAmountOfRegions(Polity polity){
		return polity.getRegions().size();
	}
	
	public double printSquare(Polity polity){
		return polity.getSquare();
	}
	
	public List<String> printRegionCenter(Polity polity){
		List<String> result = new ArrayList<String>();
		for (Region region : polity.getRegions()) {
			result.add(new String(region.getName()));
		}
		return result;
	}

}
