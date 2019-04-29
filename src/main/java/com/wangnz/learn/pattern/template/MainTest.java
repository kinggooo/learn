package com.wangnz.learn.pattern.template;

import com.wangnz.learn.pattern.template.impl.Student;
import com.wangnz.learn.pattern.template.impl.Teacher;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/4/19.
 */
public class MainTest {
    private static HashMap<String, Integer> quotaValueMap = new HashMap<>();

    static {
        quotaValueMap.put("N0", 1);
        quotaValueMap.put("N1", 2);

    }

    public static void main(String[] args) {
//        AbstractDisplay ad1 = new CharDisplay('H');
//        ad1.display();
//
//        AbstractDisplay ad2 = new StringDisplay("Hello，world.");
//        ad2.display();
//        BigDecimal interest = new BigDecimal(0.006);
//        double dbl = interest.setScale(2, BigDecimal.ROUND_UP).doubleValue();
//        BigDecimal a = new BigDecimal(102);
//        BigDecimal b = new BigDecimal(101);
//        System.out.println(a.compareTo(b));
//
//        String name = "王楠之";
//        System.out.println("*" + name.substring(1));
//        BigDecimal rate = new BigDecimal("0.00026");
//        rate = rate.multiply(new BigDecimal(100)).stripTrailingZeros();
//        System.out.println(rate);
//        BigDecimal b1 = new BigDecimal("0.021");
//        b1 = b1.setScale(2, BigDecimal.ROUND_UP);
//        System.out.println(b1);
//        String bankcardNo = "6013820800102535927";
//        System.out.println(bankcardNo.substring(0, 7));
//        if (null != bankcardNo) {
//            System.out.println(bankcardNo.replaceAll("(\\d{4})\\d+(\\d{4})", "$1********$2"));
//        } else {
//            System.out.println("未知银行");
//        }
        int a = quotaValueMap.get("N1");
        System.out.println(a);

        Person p1 = new Student();
        Person p2 = new Teacher();
        System.out.println(p1.getName());
        System.out.println(p2.getName());
    }
}
