package com.wangnz.learn;

import java.io.*;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
//        String str = "302";
//
//        int firstReasonInt = Integer.valueOf(str.substring(0, 1));
//        int secondReasonInt = Integer.valueOf(str.substring(1));
//
//        System.out.println(firstReasonInt);
//        System.out.println(secondReasonInt);
//
//        BigDecimal b1 = new BigDecimal("100.6000");
//        BigDecimal b2 = new BigDecimal("100");
//        BigDecimal b3 = b2.subtract(b1);
//        if (b3.doubleValue() < 0) {
//            System.out.println(b3.abs());
//        }
//        Test t = new Test();
//        t.m1();
        BigDecimal captial = new BigDecimal("1007.825");
        BigDecimal interest = new BigDecimal("1016.825");
        BigDecimal total_amount = captial.add(interest);
        System.out.println(total_amount.toString());
        System.out.println(String.format("%.2f", total_amount));

        total_amount = total_amount.setScale(2, BigDecimal.ROUND_UP);
        System.out.println(total_amount.toString());
        System.out.println(String.format("%.2f", total_amount));
        int i = captial.compareTo(interest);
        System.out.println(i);
        BigDecimal b1 = new BigDecimal("1000");
        BigDecimal b2 = new BigDecimal("-2000");
        BigDecimal b3 = b1.add(b2);
        System.out.println(b1.negate());
        int symbolCode = 3;
        if (symbolCode != 1 && symbolCode != 2) {// 增加
            System.out.println(symbolCode);
        }
        try {
            BigDecimal amt = new BigDecimal("123abc");
        } catch (Exception e) {
            System.out.println("err");
        }

        String addr = "1234567";
        int addrMaxLen = 6;
        if (addr.length() >= addrMaxLen) {
            String addr1 = addr.substring(0, addrMaxLen);
            String addr2 = addr.substring(addrMaxLen);
            System.out.println(addr1);
            System.out.println(addr2);
        }

//        try {
//            String template = readFile("/Users/wangnz/Documents/xydcontracttemplate_v1.3.html");
//            String content = replaceContent(template);
//            writeFile("/Users/wangnz/Documents/xydcontract_v1.3.html", content);
//            writeFileWithFW("/Users/wangnz/Documents/test.txt", "new line\n");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        String accountNo = "12345678";
//        System.out.println(accountNo.substring(accountNo.length() - 4));
//
//        List<String> ls = new ArrayList<>();
//        ls.add("a");
//        altList(ls);
        System.out.println("1" + null);

        String str = "上海市徐汇区虹桥路168号-12幢-2702室;areaId=658522;x=31.197757;y=121.440046;";
        String regexp = ".*areaId=(\\d{6}).*";
        Matcher matcher = Pattern.compile(regexp).matcher(str);
        String areaId = "";
        if (matcher.find()) {
            areaId = matcher.group(1);
        }
        System.out.println(areaId);
        str = "1234.56";

        System.out.println(str.substring(3, 4));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");

        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();

        BigDecimal a = new BigDecimal("0.025");
        BigDecimal b = new BigDecimal("0.050");
        System.out.println(a.divide(b));
    }

    public static List<String> altList(List<String> ls) {
        List<String> ls1 = new ArrayList<>();
        ls1.add("b");
        ls = ls1;
        return ls;
    }

    public void createHtmlFile(String htmlTemplatePath, String htmlPath) {

    }

    public static String readFile(String path) throws IOException {
        InputStream is = null;
        String result = "";
        try {
            is = new FileInputStream(path);
            @SuppressWarnings("unused")
            int data = 0;
            byte[] by = new byte[is.available()];

            while ((data = is.read(by)) != -1) {
                result = new String(by, 0, by.length);
            }
        } catch (FileNotFoundException e) {
            System.out.println("未找到模板文件！");
        } finally {
            System.out.println("创建成功！");
            is.close();
        }
        return result;
    }

    public static String replaceContent(String content) throws IOException {
        String replacetr = content == null ? "" : content;
        //replace(char oldChar, char newChar)返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的
        replacetr = replacetr.replace("{{contractNo}}", "1234567");
        replacetr = replacetr.replace("{{custName}}", "aaa");
        replacetr = replacetr.replace("{{certNo}}", "7654321");
        return replacetr;
    }

    public static void writeFile(String path, String content) throws IOException {
        File file = new File(path);

        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(content);
        bw.close();

        System.out.println("Done");
    }

    public static void writeFileWithFW(String path, String content) throws IOException {

        File file = new File(path);

        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter fw = new FileWriter(file, true);
        fw.write(content);
        fw.close();
//        BufferedWriter bw = new BufferedWriter(fw);
//        bw.write(content);
//        bw.close();

        System.out.println("Done");
    }

    public void m1() {
        m2();
    }

    public void m2() {
        m3();
    }

    public void m3() {
        throw new TestException("一个自定义异常");
    }
}

class TestException extends RuntimeException {
    TestException() {
    }

    TestException(String msg) {
        super(msg);
    }
}