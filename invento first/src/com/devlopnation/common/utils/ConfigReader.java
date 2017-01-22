package com.devlopnation.common.utils;

import java.util.ResourceBundle;

public class ConfigReader {
	public static final ResourceBundle rb = ResourceBundle.getBundle("config");
	public static String getCompanyName(){
		return rb.getString("companyname");
	}
}
