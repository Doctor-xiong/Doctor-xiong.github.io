package com.xjt.graduate.provider;

import com.xjt.graduate.po.IUserDao;
import com.xjt.graduate.po.UserDao;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.*;
import java.lang.reflect.*;

public class ReadExcel {
//    public static void main(String[] args) {
//        ReadExcel obj = new ReadExcel();
//        // 此处为我创建Excel路径：E:/zhanhj/studysrc/jxl下
//        File file = new File("/Users/xiongjieteng/Desktop/hhhh.xlsx");
//        obj.readExcel(file);
//    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class<?> clazz = Class.forName("com.xjt.graduate.po.Persion");
        Constructor<?> con = clazz.getConstructor(String.class,Integer.class);
        System.out.println(con.newInstance("xiong",24));
        Object ni = con.newInstance("xiong",24);
        System.out.println("-----------------");
        Method method1 = clazz.getMethod("printPersion");
        Method method2 = clazz.getMethod("setName", String.class);
        method2.invoke(ni,"xiong1");
        method1.invoke(ni);

        Field field = clazz.getDeclaredField("name");
        field.setAccessible(true);
        field.set(ni,"zhang");
        System.out.println(field.get(ni));
    }
    // 去读Excel的方法readExcel，该方法的入口参数为一个File对象
    public void readExcel(File file) {
        try {
            // 创建输入流，读取Excel
            InputStream is = new FileInputStream(file.getAbsolutePath());
            // jxl提供的Workbook类
            Workbook wb = WorkbookFactory.create(is);
            System.out.println("wb:" + wb.getNumberOfSheets());

        } catch (InvalidFormatException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void proxyTest(){
        UserDao userDao = (UserDao) new MProxy().bind(new IUserDao());
        userDao.save();
    }
}