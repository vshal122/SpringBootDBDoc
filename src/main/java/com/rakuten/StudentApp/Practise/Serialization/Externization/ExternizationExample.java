package com.rakuten.StudentApp.Practise.Serialization.Externization;

import java.io.*;

public class ExternizationExample  implements Externalizable {

    String name;
    int i;
    int j;

    public ExternizationExample() {
        System.out.println("No Arg Constructors");
    }

    public ExternizationExample(String name, int i, int j) {
        this.name = name;
        this.i = i;
        this.j = j;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

        out.writeObject(name);
        out.writeInt(i);

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
      name = (String) in.readObject();
       i =  in.readInt();

    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {


        ExternizationExample externalizableObj = new ExternizationExample("This is good",34,9989);

        FileOutputStream fos = new FileOutputStream("externizable.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
        objectOutputStream.writeObject(externalizableObj);

        FileInputStream fileInputStream = new FileInputStream("externizable.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ExternizationExample externizationExample= (ExternizationExample) objectInputStream.readObject();

        System.out.println(externizationExample.name+externizationExample.i+externizationExample.j);


    }
}
