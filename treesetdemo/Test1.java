/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treesetdemo;

import java.util.TreeSet;

/**
 *
 * @author Deepak
 */
public class Test1
{
    public static void main(String[] args)
    {
        TreeSet ts = new TreeSet();
        
        //ts.add(null);

        ts.add("EEE");
        ts.add("GGG");
        ts.add("BBB");
        ts.add("DDD");
        ts.add("CCC");
        ts.add("AAA");
        ts.add("FFF");

        System.out.println(ts);
    }
}
