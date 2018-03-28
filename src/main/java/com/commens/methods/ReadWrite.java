package com.commens.methods;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

import static com.commens.methods.Constants.FILE_NAME_EXCEL;

/**
 * User: zuoxiaoqi
 * Date: 2018/3/19
 * Time: 上午10:34
 */

public class ReadWrite {


    // 读取oms-sheet数据--string
    public static String readOmsString(int i, int j) {


        try {
            FileInputStream file = new FileInputStream(FILE_NAME_EXCEL);
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheet("Oms");
            XSSFRow now = sheet.getRow(i);
            XSSFCell cellOms = now.getCell(j);

            return cellOms.getStringCellValue();


        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }

    // 读取oms-sheet数据-data
    public static String readOmsDate(int i, int j) {


        try {
            FileInputStream file = new FileInputStream(FILE_NAME_EXCEL);
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheet("Oms");
            XSSFRow now = sheet.getRow(i);
            XSSFCell cellOms = now.getCell(j);
            return cellOms.getRawValue();

        } catch (IOException e) {
            e.printStackTrace();

            return null;
        }

    }

    // 读取Uc-sheet数据-string
    public static String readUcString(int i, int j) {

        try {
            FileInputStream file = new FileInputStream(FILE_NAME_EXCEL);
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheet("Uc");
            XSSFRow now = sheet.getRow(i);
            XSSFCell cellUc = now.getCell(j);

            return cellUc.getStringCellValue();


        } catch (IOException e) {
            e.printStackTrace();

            return null;
        }

    }

    // 读取åUc-sheet数据-data
    public static String readUcData(int i, int j) {

        try {
            FileInputStream file = new FileInputStream(FILE_NAME_EXCEL);
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheet("Uc");
            XSSFRow now = sheet.getRow(i);
            XSSFCell cellUc = now.getCell(j);

            return cellUc.getRawValue();


        } catch (IOException e) {
            e.printStackTrace();

            return null;
        }

    }

    // 读取Dc-sheet数据-sting
    public static String readDcString(int i, int j) {

        try {
            FileInputStream file = new FileInputStream(FILE_NAME_EXCEL);
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheet("Dc");
            XSSFRow now = sheet.getRow(i);
            XSSFCell cellDc = now.getCell(j);

            return cellDc.getStringCellValue();


        } catch (IOException e) {
            e.printStackTrace();

            return null;
        }

    }

    // 读取Dc-sheet数据-data
    public static String readDcData(int i, int j) {

        try {
            FileInputStream file = new FileInputStream(FILE_NAME_EXCEL);
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheet("Dc");
            XSSFRow now = sheet.getRow(i);
            XSSFCell cellDc = now.getCell(j);

            return cellDc.getRawValue();


        } catch (IOException e) {
            e.printStackTrace();

            return null;
        }

    }

    // 读取Wms-sheet数据-String
    public static String readWmsString(int i, int j) {

        try {
            FileInputStream file = new FileInputStream(FILE_NAME_EXCEL);
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheet("Wms");
            XSSFRow now = sheet.getRow(i);
            XSSFCell cellWms = now.getCell(j);

            return cellWms.getStringCellValue();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }

    // 读取Wms-sheet数据-Data
    public static String readWmsData(int i, int j) {

        try {
            FileInputStream file = new FileInputStream(FILE_NAME_EXCEL);
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheet("Wms");
            XSSFRow now = sheet.getRow(i);
            XSSFCell cellWms = now.getCell(j);

            return cellWms.getRawValue();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }

    // 读取Message-sheet数据-String
    public static String readMessageString(int i, int j) {

        try {
            FileInputStream file = new FileInputStream(FILE_NAME_EXCEL);
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheet("Message");
            XSSFRow now = sheet.getRow(i);
            XSSFCell cellWms = now.getCell(j);

            return cellWms.getStringCellValue();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }

    // 读取Login-sheet数据-String
    public static String readLoginString(int i, int j) {

        try {
            FileInputStream file = new FileInputStream(FILE_NAME_EXCEL);
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheet("Login");
            XSSFRow now = sheet.getRow(i);
            XSSFCell cellWms = now.getCell(j);

            return cellWms.getStringCellValue();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }

    // 读取Login-sheet数据-Data
    public static String readLoginData(int i, int j) {

        try {
            FileInputStream file = new FileInputStream(FILE_NAME_EXCEL);
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheet("Login");
            XSSFRow now = sheet.getRow(i);
            XSSFCell cellWms = now.getCell(j);

            return cellWms.getStringCellValue();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }

}
