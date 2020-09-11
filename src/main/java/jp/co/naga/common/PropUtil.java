package jp.co.naga.common;


import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * プロパティファイルの使用をサポートする.
 */
public class PropUtil{
//	private static String ResourceFileName = null;

	private static ResourceBundle bundle = null;

	public static void setProp(String propName){
    	try {
    		bundle = ResourceBundle.getBundle(propName);
    	} catch (MissingResourceException e) {
    		return;
    	}
		return;
	}

    public static String getPropVal(String key){
    	String propVal = null;
    	try {
    		propVal = bundle.getString(key);
    	} catch (MissingResourceException e) {
    		return propVal;
    	}
		return propVal;
    }
}
