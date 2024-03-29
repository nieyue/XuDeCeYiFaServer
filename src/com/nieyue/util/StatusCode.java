package com.nieyue.util;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 状态码常量类
 * @author yy
 *
 */
public class StatusCode {
	
	/**
	 * 读取 properties
	 * @param key
	 * @return
	 */
	public static String GetValueByKey(String key){
		 Locale locale = Locale.getDefault();  
         ResourceBundle localResource = ResourceBundle.getBundle("config/StatusCode", locale);
         try {
        	 String value = localResource.getString(key); 
        	 return value;
			
		} catch (Exception e) {
			return null;
		}
	}
	public static void main(String[] args) {
		System.out.println(StatusCode.GetValueByKey("SUCCESS"));
		//System.out.println(SUCCESS);
	}
	/**
	 * 成功
	 */
	public static String SUCCESS="SUCCESS";
	/**
	 * 失败
	 */
	public static String ERROR="ERROR";
	/**
	 * 用户已经存在
	 */
	public static String USER_EXIST="USER_EXIST";
	/**
	 * 商户已经存在
	 */
	public static String SELLER_EXIST="SELLER_EXIST";
	/**
	 * 用户不存在
	 */
	public static String USER_NOT_EXIST="USER_NOT_EXIST";
	/**
	 * 商户不存在
	 */
	public static String SELLER_NOT_EXIST="SELLER_NOT_EXIST";
	/**
	 * 一分钟请求一次
	 */
	public static String ONE_ASK_ONE="ONE_ASK_ONE";
	/**
	 * 验证码错误
	 */
	public static String VERIFICATION_CODE_ERROR="VERIFICATION_CODE_ERROR";
	/**
	 * 验证码过期
	 */
	public static String VERIFICATION_CODE_EXPIRED="VERIFICATION_CODE_EXPIRED";
	/**
	 * 会话过期
	 */
	public static String SESSION_EXPIRED="SESSION_EXPIRED";
	/**
	 * 商品分类已经存在
	 */
	public static String MERCATE_EXIST="MERCATE_EXIST";
	
}
