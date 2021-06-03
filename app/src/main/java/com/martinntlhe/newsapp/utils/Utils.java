package com.martinntlhe.newsapp.utils;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;

import org.ocpsoft.prettytime.PrettyTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class Utils {

    public static ColorDrawable[] vibrantLightColorList =  {
            new ColorDrawable(Color.parseColor("#ffeead")),
            new ColorDrawable(Color.parseColor("#93cfb3")),
            new ColorDrawable(Color.parseColor("#fd7a7a")),
            new ColorDrawable(Color.parseColor("#faca5f")),
            new ColorDrawable(Color.parseColor("#1ba798")),
            new ColorDrawable(Color.parseColor("#6aa9ae")),
            new ColorDrawable(Color.parseColor("#ffbf27")),
            new ColorDrawable(Color.parseColor("#d93947"))
    };

    public static ColorDrawable getRandomDrawbleColor() {
        int idx = new Random().nextInt(vibrantLightColorList.length);
        return vibrantLightColorList[idx];
    }

    public static String DateToTimeFormat(String oldDate){
        PrettyTime p = new PrettyTime(new Locale(getCountry()));
        String isTime = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss",
                    Locale.ENGLISH);
            Date date = sdf.parse(oldDate);
            isTime = p.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return isTime;
    }

    public static String DateFormat(String oldDate){
        String newDate;
        SimpleDateFormat dateFormat = new SimpleDateFormat("E, d MMM yyyy", new Locale(getCountry()));
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd", Locale.US).parse(oldDate);
            assert date != null;
            newDate = dateFormat.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
            newDate = oldDate;
        }

        return newDate;
    }

    public static String getCountry(){
        Locale locale = Locale.getDefault();
        String country = locale.getCountry();
        return country.toLowerCase();
    }

}