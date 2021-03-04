package ar.com.pa.utils;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MapperUtils {

    private static Logger logger = LoggerFactory.getLogger(MapperUtils.class);

	public static int convertToValue(String[] value, int index) {
		String valueToAdd = value[index].substring(2,value[index].length());
		return Integer.parseInt(valueToAdd);
	}

	public static Date convertToDate(String[] value,String[] periods ,int index) {
		
		int periodIndex = Integer.parseInt(value[index].substring(0,1));
		String date = periods[periodIndex - 1];

	    Date datePeriod = toDate(date);
	    
		return datePeriod;
	}
	
	public static Date toDate(String date) {

		try {
			DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MMM d, u", Locale.ENGLISH);
			LocalDate localDatePeriod = LocalDate.parse(date, dateFormatter);
			return java.sql.Date.valueOf(localDatePeriod);
		}catch (Exception e) {
			logger.error("Date erronea");
			return null;
		}
	}
	
	
	public static int stringToNum(String s) {
		try {
			return Integer.parseInt(s);
		} catch (Exception e) {
			return -1;
		}	
	}
	
	public static String addFormat(String old, String next) {
		return String.format("%s %s", old, next);
	}
	
	
	
}
