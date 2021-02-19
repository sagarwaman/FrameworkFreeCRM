package com.common.Dataprep;

import com.common.utilities.DateTimefunction;
import com.common.utilities.WriteExcelData;
import com.constants.Config;

public class SetDataProvider {
	
	public static void Dataprep() {
		
		int number = DateTimefunction.Generaterandom();
		
		WriteExcelData.settestdata(Config.Filepath, "ContactsTest", 1, "Firstname", "A"+number);
		WriteExcelData.settestdata(Config.Filepath, "ContactsTest", 1, "Lastname","B"+ number);
		WriteExcelData.settestdata(Config.Filepath, "ContactsTest", 1, "Middlename","C"+ number);
		WriteExcelData.settestdata(Config.Filepath, "ContactsTest", 1, "Company", "D"+ number);
	}

}
