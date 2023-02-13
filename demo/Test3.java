/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.TreeSet;

class Student1 implements Comparable
{
    int rollno;
    String name;

    public Student1(int rollno, String name)
    {
        this.rollno=rollno;
        this.name=name;
    }

    @Override
    public int compareTo(Object o)
    {
        Student1 st=(Student1) o;
        Integer i1=new Integer(this.rollno);
        Integer i2=new Integer(st.rollno);
//        if(i1>i2)
//        {
//            return 1;
//        }
//        else if(i1<i2)
//        {
//            return -1;
//        }
//        else
//        {
//            return 0;
//        }
        int val=i1.compareTo(i2);
        return -val;
    }

    @Override
    public String toString()
    {
        return rollno+"-"+name;
    }
}
public class Test3
{
    public static void main(String[] args)
    {
        Student1 s1=new Student1(101, "deepak");
        Student1 s5=new Student1(105, "priya");
        Student1 s3=new Student1(103, "rahul");
        Student1 s4=new Student1(104, "amit");
        Student1 s2=new Student1(102, "deepesh");
        
        TreeSet ts=new TreeSet();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        System.out.println(ts);
    }
}
