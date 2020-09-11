package jp.co.naga.servlet;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class practiceutil {

	public static String changeCode(String a_code){

		String l_afterCode = null;

//		Pattern p = Pattern.compile("^[0-9]*$");
		Pattern p = Pattern.compile("^[a-z]{1,4}");
		Matcher m = p.matcher(a_code);

		System.out.println(m.find());
		if (m.find()){

		System.out.println(m.group(1));
	      for (int i = 1 ; i <= m.groupCount(); i ++){
	        System.out.println("[Group" + i + "] " + m.group(i));
	      }
		}


//		if(a_code.matches("[a-z]{1,4}")){
//			System.out.println(a_code);
//		}

		return l_afterCode;

	}

}
