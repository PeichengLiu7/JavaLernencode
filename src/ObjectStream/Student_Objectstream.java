package ObjectStream;

import java.io.Serializable;

public class Student_Objectstream implements Serializable {
    //Serializable 接口里面是没有抽象方法，标记性接口
    //相当于给Student类打了一个标记
    //这就代表着一旦实现了这个接口，那么就表示当前的Student类可以被序列化，可以用Objectstream写到本地文件
    //如果没有这个标记，就不能用序列化流来序列化这个对象

    //如果不想让某个属性被序列化，可以使用transient关键字修饰
    //固定版本号
    private static final long serialVersionUID = 1L;
    private  String name;
    private  int age;

    private String address;

    public Student_Objectstream(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student_Objectstream() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
