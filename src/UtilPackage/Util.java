package UtilPackage;

public class Util {
    public static boolean ispasswordvalid(String password){
        boolean flag1 = false, flag2 = false;
        int i=0;
        while(!flag1 && !flag2){
            if(password.charAt(i)>='0' || password.charAt(i)<='9')
                flag1 = true;
            else if(password.charAt(i)>='a' || password.charAt(i)<='z')
                flag2 = true;
            else if(password.charAt(i)>='A' || password.charAt(i)<='Z')
                flag2 = true;
            i++;
        }
        if(flag1 && flag2){
            return true;
        }
        else
            return false;
    }
}
