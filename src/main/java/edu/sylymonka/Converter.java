package edu.sylymonka;/*
  @author   silim
  @project   converter-roman-to-arabic
  @class  Converter
  @version  1.0.0 
  @since 15.02.2024 - 18.18
*/

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Converter {

    public static Integer convertFromRomanToArabic(String romanNumber){
        Map<Character,Integer> values = new HashMap<>(){
            {
                put('I',1);put('V',5);put('X',10);
                put('L',50);put('C',100);put('D',500);
                put('M',1000);
            }
        };
        int count =4;
        String regex = "^(?=[MDCLXVI])M{0,3}(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(romanNumber);
        if (!matcher.find()){
            throw new IllegalArgumentException("Argument is incorrect");
        }

        int result = 0;
        romanNumber=romanNumber.replace("IV","IIII");
        romanNumber=romanNumber.replace("IX","VIIII");
        romanNumber=romanNumber.replace("XL","XXXX");
        romanNumber=romanNumber.replace("XC","LXXXX");
        romanNumber=romanNumber.replace("CD","CCCC");
        romanNumber=romanNumber.replace("CM","DCCCC");

        for (Character i : values.keySet()){
            for (int j =0;j<romanNumber.length();j++){
                if (romanNumber.charAt(j)==i){
                    result+=values.get(i);
                }

            }
        }
        return result;
    }
}
