package com.cybertek.tests.d11_upload_action_class;

import org.testng.annotations.Test;

public class FileExamples {

    @Test
    public void test(){
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.home"));

        String projectPath = System.getProperty("user.dir");
        String relativePAth = "src/text/resources/test_file.txt";

        String fullPath = projectPath+relativePAth;
        System.out.println(fullPath);
    }
}
