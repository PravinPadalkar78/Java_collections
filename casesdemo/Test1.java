/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casesdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

/**
 *
 * @author Deepak
 */
class Student implements Comparable
{
    int rollno;
    String name;

    public Student(int rollno, String name)
    {
        this.rollno=rollno;
        this.name=name;
    }

    @Override
    public int compareTo(Object o)
    {
        Student st=(Student)o;
        //return -this.name.compareTo(st.name);
        return 0;
    }

    @Override
    public String toString()
    {
        return rollno+"-"+name;
    }
}
public class Test1
{
    public static void main(String[] args)
    {
        Student s1=new Student(101, "aaa");
        Student s2=new Student(102, "fff");
        Student s3=new Student(103, "ddd");
        Student s4=new Student(104, "kkk");
        Student s5=new Student(105, "eee");
        
        TreeSet ts=new TreeSet();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        System.out.println(ts);
    }
}