package presidentsYear;

import java.util.ArrayList;
import java.util.List;

public class ListOfPresidents {

	private List<President> presidentList;

	public ListOfPresidents(List<President> listName) {
		presidentList = listName;
	}

	public List<Integer> findBestYears(int mostPresidents){
		
		List<Integer> bestYears = new ArrayList<Integer>();

		for (int i = 1732; i < 2018; i++) {
			List<President> pres = new ArrayList<>();
			for (President p : presidentList) {

				if (p.getBirthYear() <= i && p.getDeathYear() >= i) {
					pres.add(p);
				}
			}
			if (pres.size() == mostPresidents) {
				bestYears.add(i);
			}	
		}
		return bestYears;
	}
	
	
	
	
	
	public int checkMostPresidents() {

		List<President> bestList = new ArrayList<>();

		for (int i = 1732; i < 2018; i++) {
			List<President> pres = new ArrayList<>();
			for (President p : presidentList) {

				if (p.getBirthYear() <= i && p.getDeathYear() >= i) {
					pres.add(p);
				}
			}
			if (pres.size() > bestList.size()) {
				bestList = pres;
			}	
		}
		return bestList.size();
	}

}
