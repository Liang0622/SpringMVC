package com.liang.converter;

import org.springframework.beans.TypeMismatchException;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class MyDateConverter implements Converter<String,Date> {
    /**
     * 用户传递来一个String类型的值，我们转换成Date
     * source字符串的具体格式不确定
     * 可能是以 / 分割，或者以  - 分割，等等
     */
    public Date convert(String s) {
        //根据用户传递过来的source来创建对应的日期格式
        SimpleDateFormat sdf=getSimpleDateFormat(s);
        Date date=null;
        try {
            date=sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 根据用户传递过来的source来创建对应的日期格式
     */
    private SimpleDateFormat getSimpleDateFormat(String s){
        SimpleDateFormat sdf=null;
        if(Pattern.matches("^\\d{4}/\\d{2}/\\d{2}$",s)){
            sdf=new SimpleDateFormat("yyyy/MM/dd");
        }else if(Pattern.matches("^\\d{4}-\\d{2}-\\d{2}$",s)){
            sdf=new SimpleDateFormat("yyyy-MM-dd");
        } else if(Pattern.matches("^\\d{4}\\d{2}\\d{2}$",s)){
            sdf=new SimpleDateFormat("yyyyMMdd");
        }else {
            throw new TypeMismatchException("",Date.class);
        }
        return sdf;
    }
}
