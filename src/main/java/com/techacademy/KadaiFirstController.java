package com.techacademy;


import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {
	
	
	//仕様1：指定日の曜日を算定する
	 @GetMapping("/dayofweek/{yyyymmdd}")
	    public String dispDayOfWeek(@PathVariable String yyyymmdd) throws ParseException {
		 
		 Calendar cal = Calendar.getInstance(); 
		    switch (cal.get(Calendar.DAY_OF_WEEK)) {
		        case Calendar.SUNDAY: return "Sunday";
		        case Calendar.MONDAY: return "Monday";
		        case Calendar.TUESDAY: return "Tseday";
		        case Calendar.WEDNESDAY: return "Wednesday";
		        case Calendar.THURSDAY: return "Thursday";
		        case Calendar.FRIDAY: return "Friday";
		        case Calendar.SATURDAY: return "Saturday";
		    }
		    throw new IllegalStateException();
		}

	//・足し算
	  @GetMapping("/plus/{val1}/{val2}")
	    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
	        int res = 0;
	        res = val1 + val2;
	        return "計算結果：" + res;
	  }
	  
	//・引き算
	  @GetMapping("/minus/{val1}/{val2}")
	    public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
	        int res = 0;
	        res = val1 - val2;
	        return "計算結果：" + res;
	  }
	  
	        
	//・掛け算
	        @GetMapping("/times/{val1}/{val2}")
		    public String calctimes(@PathVariable int val1, @PathVariable int val2) {
		        int res = 0;
		        res = val1 * val2;
		        return "計算結果：" + res;
	        }
	        
	//・割り算   
	        @GetMapping("/divide/{val1}/{val2}")
		    public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
		        int res = 0;
		        res = val1 / val2;
		        return "計算結果：" + res;
	        }
	        
}
