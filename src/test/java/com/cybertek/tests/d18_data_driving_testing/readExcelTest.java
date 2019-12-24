package com.cybertek.tests.d18_data_driving_testing;

import com.cybertek.utilites.ExcelUtil;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class readExcelTest {
    @Test
    public void readExcelTEst(){

        //create an instance of the excel utility
        //1argument: location of the file
        //2argument : sheet we want to open
        //when we creat object of this utility it means we opened the file and accessed certain sheetinside it
        ExcelUtil qa1Short = new ExcelUtil("src/test/resources/Vytrack testusers.xlsx", "QA1-short");
        //get number of columns
        System.out.println("Column count: "+ qa1Short.columnCount());
        //get all column names
        System.out.println(qa1Short.getColumnsNames());

        //get all data
        List<Map<String,String>> dataList=qa1Short.getDataList();
        for (Map<String,String> stringStringMap : dataList){
            System.out.println(stringStringMap);
        }

        //get all data in 2d array
        String [][] dataArray = qa1Short.getDataArray();
        System.out.println("==============");
        System.out.println(Arrays.deepToString(dataArray));

    }



}
