package com.example.supertech.csc201real;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Supertech on 2016/07/12.
 */
public class ChangeTextColor
{
    public SpannableStringBuilder changeTextColor(String s) {
        String content = s;
        SpannableStringBuilder ssb = new SpannableStringBuilder(content);
        String keywords[] = {"public","implements","import","super","continue","this","int","extends","final","float","long","new","return","short","static","throw","void","private","boolean","byte","char","class","double","case","assert","break","catch","for","if","switch","while","do","try","else"};//,"digits","Strings","comments" //,"finally","goto","const","default","volatile","strictfb","native","synchronized","transient","package","abstract","protected","instanceof","throws","enum","interface",

        Pattern p;
        Matcher m;

        //for keywords
        for (int i = 0; i < keywords.length; i++) {

            p = Pattern.compile(keywords[i]+" ");
            m = p.matcher(s);
            while (m.find()) {
                ssb.setSpan(new ForegroundColorSpan(Color.BLUE), m.start(), m.end() - 1, Spanned.SPAN_INCLUSIVE_INCLUSIVE);
            }


        }

        //check for digits
        p = Pattern.compile(" \\d*[.]?\\d*");
        m = p.matcher(s);

        while (m.find()) {
            ssb.setSpan(new ForegroundColorSpan(Color.rgb(132,0,43)), m.start(), m.end(), Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        }

        //check for strings
        p = Pattern.compile("[\"].*[\"]");
        m = p.matcher(s);

        while (m.find())
        {
            ssb.setSpan(new ForegroundColorSpan(Color.rgb(0,100,0)), m.start(), m.end(), Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        }

        //check for single list_selected_selector comments

        p = Pattern.compile("//.*\n");
        m = p.matcher(s);

        while (m.find()) {
            ssb.setSpan(new ForegroundColorSpan(Color.RED), m.start(), m.end(), Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        }

        return ssb;
    }
}
