package com.fmt;

public class DatabaseInfo {

	/**
	 * Connection parameters that are necessary for CSE's configuration
	 */
	public static final String PARAMETERS = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

	public static final String USERNAME = "aperkey";
	public static final String PASSWORD = "zCCVkoB4";
	public static final String URL = "jdbc:mysql://cse.unl.edu/" + USERNAME + PARAMETERS;

}
