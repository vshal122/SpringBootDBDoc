package com.rakuten.StudentApp.Practise.Serialization;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.*;

@Getter
@Setter
class TarunFile implements Serializable  {
  int rollNo;
  String name;

    public TarunFile(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "TarunFile{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }
}

public class SerializationFirst {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileOutputStream fos = new FileOutputStream("zxc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(new TarunFile(25,"Shyam"));

        FileInputStream fis = new FileInputStream("xyz.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fis);
        TarunFile tarunFile =(TarunFile) objectInputStream.readObject();
        System.out.println(tarunFile);


    }
}
