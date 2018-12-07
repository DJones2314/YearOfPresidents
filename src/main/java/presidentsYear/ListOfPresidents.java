package presidentsYear;

import java.util.ArrayList;
import java.util.List;

public class ListOfPresidents {

	private List<President> presidentList;

	public ListOfPresidents(List<President> listName) {
		presidentList = listName;
	}

	public String checkBestYear() {

		List<President> bestList = new ArrayList<>();

		int bestYear = 0;

		for (int i = 1732; i < 2018; i++) {
			List<President> pres = new ArrayList<>();
			for (President p : presidentList) {

				if (p.getBirthYear() <= i && p.getDeathYear() >= i) {
					pres.add(p);
				}

			}

			if (pres.size() > bestList.size()) {
				bestList = pres;
				bestYear = i;
			}

						
		}

		return " The best year for presidents being alive is " + bestYear + " with " + bestList.size();
	}

}
