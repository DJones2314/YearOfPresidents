package presidentsYear;

import java.io.IOException;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Read reader = new Read();
		President presTest = new President();
		
		
		
		String presidentFile = "C:\\LocalInstall\\presidents.txt";
		
		try {
			ListOfPresidents pressList = new ListOfPresidents(reader.presList(presidentFile));
			System.out.println(pressList.findBestYears(pressList.checkMostPresidents()));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

		
		//reader.copy(C:\LocalInstall\presidents.txt, outFile);
		
		

	}

}
