package edu.sylymonka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
  @author   silim
  @project   converter-roman-to-arabic
  @class  ConverterTest
  @version  1.0.0 
  @since 15.02.2024 - 18.34
*/class ConverterTest {

    @Test
    public void whenNumberIsGreaterThanMMMCMXCIXThenNull(){
        Assertions.assertThrows(IllegalArgumentException.class,()->Converter.convertFromRomanToArabic("_I_V"));
    }
    @Test
    public void whenNumberisIncorrectThenNull(){
        Assertions.assertThrows(IllegalArgumentException.class,()->Converter.convertFromRomanToArabic("MMMM"));
    }
    @Test
    public void whenNumberIsIncorrect2ThenNull(){
        Assertions.assertThrows(IllegalArgumentException.class,()->Converter.convertFromRomanToArabic("LVL"));
    }
    @Test
    public void whenNumberIsIncorrect4ThenNull(){
        Assertions.assertThrows(IllegalArgumentException.class,()->Converter.convertFromRomanToArabic("CCCC"));
    }
    @Test
    public void whenNumberIsIncorrect3ThenNull(){
        Assertions.assertThrows(IllegalArgumentException.class,()->Converter.convertFromRomanToArabic("DD"));
    }
    @Test
    public void whenNumberIsIncorrect5ThenNull(){
        Assertions.assertThrows(IllegalArgumentException.class,()->Converter.convertFromRomanToArabic("ABC"));
    }
    @Test
    public void whenNumberIsIncorrect6ThenNull(){
        Assertions.assertThrows(IllegalArgumentException.class,()->Converter.convertFromRomanToArabic("lx"));
    }
    @Test
    public void whenNumberIsLessThanMMMCMXCIXThenNotNull(){
        Assertions.assertNotNull(Converter.convertFromRomanToArabic("MMMCMXCIX"));
    }


    @Test
    public void whenNumberIsIThen1(){
        Assertions.assertEquals(1,Converter.convertFromRomanToArabic("I"));
    }
    @Test
    public void whenNumberIsIIIThen3(){
        Assertions.assertEquals(3,Converter.convertFromRomanToArabic("III"));
    }
    @Test
    public void whenNumberIsIVThen4(){
        Assertions.assertEquals(4,Converter.convertFromRomanToArabic("IV"));
    }
    @Test
    public void whenNumberIsVThen5(){
        Assertions.assertEquals(5,Converter.convertFromRomanToArabic("V"));
    }
    @Test
    public void whenNumberIsVIThen6(){
        Assertions.assertEquals(6,Converter.convertFromRomanToArabic("VI"));
    }
    @Test
    public void whenNumberIsVIIIThen8(){
        Assertions.assertEquals(8,Converter.convertFromRomanToArabic("VIII"));
    }
    @Test
    public void whenNumberIsIXThen9(){
        Assertions.assertEquals(9,Converter.convertFromRomanToArabic("IX"));
    }
    @Test
    public void whenNumberIsXThen10(){
        Assertions.assertEquals(10,Converter.convertFromRomanToArabic("X"));
    }
    @Test
    public void whenNumberIsXXIVThen24(){
        Assertions.assertEquals(24,Converter.convertFromRomanToArabic("XXIV"));
    }
    @Test
    public void whenNumberIsXXXThen30(){
        Assertions.assertEquals(30,Converter.convertFromRomanToArabic("XXX"));
    }
    @Test
    public void whenNumberIsXXXIXThen39(){
        Assertions.assertEquals(39,Converter.convertFromRomanToArabic("XXXIX"));
    }
    @Test
    public void whenNumberIsXLThen40(){
        Assertions.assertEquals(40,Converter.convertFromRomanToArabic("XL"));
    }
    @Test
    public void whenNumberIsXLVThen45(){
        Assertions.assertEquals(45,Converter.convertFromRomanToArabic("XLV"));
    }
    @Test
    public void whenNumberIsLThen50(){
        Assertions.assertEquals(50,Converter.convertFromRomanToArabic("L"));
    }
    @Test
    public void whenNumberIsLXThen60(){
        Assertions.assertEquals(60,Converter.convertFromRomanToArabic("LX"));
    }
    @Test
    public void whenNumberIsLXXIIIThen73(){
        Assertions.assertEquals(73,Converter.convertFromRomanToArabic("LXXIII"));
    }
    @Test
    public void whenNumberIsLXXXThen80(){
        Assertions.assertEquals(80,Converter.convertFromRomanToArabic("LXXX"));
    }
    @Test
    public void whenNumberIsXCThen90(){
        Assertions.assertEquals(90,Converter.convertFromRomanToArabic("XC"));
    }
    @Test
    public void whenNumberIsCThen100(){
        Assertions.assertEquals(100,Converter.convertFromRomanToArabic("C"));
    }
    @Test
    public void whenNumberIsCLThen150(){
        Assertions.assertEquals(150,Converter.convertFromRomanToArabic("CL"));
    }
    @Test
    public void whenNumberIsCCCThen300(){
        Assertions.assertEquals(300,Converter.convertFromRomanToArabic("CCC"));
    }
    @Test
    public void whenNumberIsCDThen400(){
        Assertions.assertEquals(400,Converter.convertFromRomanToArabic("CD"));
    }
    @Test
    public void whenNumberIsDThen500(){
        Assertions.assertEquals(500,Converter.convertFromRomanToArabic("D"));
    }
    @Test
    public void whenNumberIsDCThen600(){
        Assertions.assertEquals(600,Converter.convertFromRomanToArabic("DC"));
    }
    @Test
    public void whenNumberIsDCCLXXXIIThen782(){
        Assertions.assertEquals(782,Converter.convertFromRomanToArabic("DCCLXXXII"));
    }
    @Test
    public void whenNumberIsDCCCThen800(){
        Assertions.assertEquals(800,Converter.convertFromRomanToArabic("DCCC"));
    }
    @Test
    public void whenNumberIsCMThen900(){
        Assertions.assertEquals(900,Converter.convertFromRomanToArabic("CM"));
    }
    @Test
    public void whenNumberIsMThen1000(){
        Assertions.assertEquals(1000,Converter.convertFromRomanToArabic("M"));
    }
    @Test
    public void whenNumberIsMDCXCIVThen10(){
        Assertions.assertEquals(1694,Converter.convertFromRomanToArabic("MDCXCIV"));
    }
    @Test
    public void whenNumberIsMMCCCXLVIIThen10(){
        Assertions.assertEquals(2247,Converter.convertFromRomanToArabic("MMCCXLVII"));
    }
    @Test
    public void whenNumberIsMMMThen3000(){
        Assertions.assertEquals(3000,Converter.convertFromRomanToArabic("MMM"));
    }
    @Test
    public void whenNumberIsMMMCMXCIXThen3999(){
        Assertions.assertEquals(3999,Converter.convertFromRomanToArabic("MMMCMXCIX"));
    }
}