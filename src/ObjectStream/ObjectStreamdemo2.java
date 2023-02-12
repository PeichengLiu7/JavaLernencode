package ObjectStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectStreamdemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建反序列化流的对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.txt"));

        //读取数据
        Object o = ois.readObject();

        //打印对象
        System.out.println(o);

        //关闭资源
        ois.close();
    }
}
