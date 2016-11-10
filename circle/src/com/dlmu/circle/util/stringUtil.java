package com.dlmu.circle.util;

/**
 * Created by cf on 2016/11/10.
 */
public class stringUtil {
    public static boolean isEmpty(String str){
        if("".equals(str)||str==null)
            return true;
        else
            return false;
    }
    public static boolean isNotNull(String str)
    {
        if(!"".equals(str)&&str!=null)
        {
            return true;
        }
        else
            return false;
    }
}
