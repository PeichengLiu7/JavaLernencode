package ObjectStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Objects;

public class ObjectStreamdemo1 {
    public static void main(String[] args) throws FileNotFoundException {

        Student_Objectstream s = new Student_Objectstream("张三", 23);

        //创建序列化流的对象
        ObjectsOutputStream oos = new ObjectsOutputStream(new FileOutputStream("student.txt"));

        oos.writeObject(s);

        oos.close();
    }
}
