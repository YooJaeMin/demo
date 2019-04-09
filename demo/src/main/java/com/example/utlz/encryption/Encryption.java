package com.example.utlz.encryption;

import java.security.MessageDigest;

public class Encryption {
	public static String getEncrypt(String argPw) {
		 
 
        try{
 
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(argPw.getBytes("UTF-8"));
            StringBuffer hexString = new StringBuffer();
 
            for (int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if(hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
 
            //출력
//            System.out.println(hexString.toString());
            return hexString.toString();
 
        } catch(Exception ex){
            throw new RuntimeException(ex);
        }
 
    }
}
