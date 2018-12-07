package presidentsYear;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Read {

	public static List<President> presList(String inFile) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(inFile));
		String line = "";
		List<President> presidentList = new ArrayList<President>();
		try {
			while ((line = br.readLine()) != null) {
				String[] presidentDetails = line.split(",.");
				if (presidentDetails[0].equals("PRESIDENT")) {
				} else {
					President president = new President(presidentDetails);
					presidentList.add(president);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {

			br.close();

		}
		return presidentList;
	}

}
