package com.rakuten.StudentApp.Practise;

import java.io.IOException;

public class ClassPathForTesting {
    public static void main(String[] args) throws IOException {
        String currentPath = new java.io.File(".").getCanonicalPath();
        String IMPORT_TEMPLATE_DIR_PATH= "webapp";
        String SLASH="/";
        String TARGET="target";
        System.out.println("Current dir:" + currentPath);
        String checklistName="checklist_new.xlsx";
        String CHECKLIST_TEMPLATE="checklistTemplate";
        String CURRENT_PATH = System.getProperty("user.dir").replace("\\", "/");
        String projectTemplateDirPath =CURRENT_PATH+SLASH+TARGET+SLASH+IMPORT_TEMPLATE_DIR_PATH+SLASH+CHECKLIST_TEMPLATE+SLASH+checklistName;
        System.out.println("Current dir using System:" + projectTemplateDirPath);
    }
}
