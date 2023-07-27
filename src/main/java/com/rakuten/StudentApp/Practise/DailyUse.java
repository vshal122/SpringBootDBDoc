package com.rakuten.StudentApp.Practise;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;

public class DailyUse {


    public static void m1()
    {
        int [] values = {10,20,50,60,90,34};

        int ans = Arrays.stream(values).sum();
        OptionalDouble ans2 = Arrays.stream(values).average();
        int ans3 = (int) Arrays.stream(values).count();
        int ans4 = Arrays.stream(values).reduce(0,Integer::sum);
        System.out.println(ans+" "+ans2+" "+ans3+" "+ans4);
    }
    public static void main1(String[] args) throws IOException {

        String date ="2022-09-11";
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date today = new Date();
        System.out.println("My date :"+formatter.format(today));
    }

    public static void main(String[] args) {
        Map<String,String> map  = new HashMap<>();
        map.put("jk","ljcknsj");
        map.put("jkl","ljcknsj");

    }

}

















// Path path = Paths.get("C:\\Users\\vishal.b.malviya\\Downloads\\value 2.xlsx");
//s Path path1 = Paths.get(args[0]);
//  Path path2 = FileSystems.getDefault().getPath("C:\\Users\\vishal.b.malviya\\Downloads\\value 2.xlsx");
// Path path3 = Paths.get(System.getProperty("user.home"), "text", "abc.txt");
//   System.out.println(path+" "+path2);

//        Path path = Paths.get("C:\\Users\\vishal.b.malviya\\Downloads\\value 2.xlsx");
//        FileSystem fs =  path.getFileSystem();
//        System.out.println(fs.toString());
//        System.out.println(path.isAbsolute());
//        System.out.println(path.getFileName());
//        System.out.println(path.toAbsolutePath().toString());
//        System.out.println(path.getRoot());
//        System.out.println(path.getParent());
//        System.out.println(path.getNameCount());
//        System.out.println(path.getName(0));
//        System.out.println(path.subpath(0, 3));
//        System.out.println(path.toString());
//        System.out.println(path.getNameCount());
//        String originalPath = "d:\\data\\projects\\a-project\\..\\another-project";
//        Path path1 = Paths.get(originalPath);
//        Path path2 = path1.normalize();
//        System.out.println("--------path2 = "+ path2);

//      File file = new File("C:\\Users\\vishal.b.malviya\\Downloads\\value 2.xlsx");
//      file.mkdir();
//
//        System.out.println(file.getCanonicalPath());
//    }
//        int length = wordList
//                .stream()
//                .reduce(
//                        0,
//                        (parLength, word) -> parLength + word.length(),
//                        (parLength, otherParLength) ->parLength+otherParLength
//                );




//        String str1="JAVA";
//        String str ="Concept";
//        String str2="";
//        for(int i= str1.length()-1;i>=0;i--)
//        {
//            str2+=str1.charAt(i);
//
//        }
//        System.out.println(str2);

