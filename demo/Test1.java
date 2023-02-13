/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.TreeSet;

/**
 *
 * @author Deepak
 */
public class Test1
{
    public static void main(String[] args)
    {
        TreeSet ts=new TreeSet();
        
        ts.add("aaa");      //compareTo()
        ts.add("fff");
        ts.add("www");
        ts.add("uuu");
        ts.add("ddd");
        
        System.out.println(ts);
        
        TreeSet ts1=new TreeSet();
        
        ts1.add(40);        //compareTo()
        ts1.add(70);
        ts1.add(30);
        ts1.add(60);
        
        System.out.println(ts1);
    }
}
