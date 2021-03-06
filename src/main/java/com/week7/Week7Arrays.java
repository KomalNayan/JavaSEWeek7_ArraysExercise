package com.week7;

class Student{
    int sid;
    String fname;
    String lname;
    Student()
    {
        sid = 0;
        fname = "Komal";
        lname = "Nayan";
    }
    Student(int sid, String fname, String lname)
    {
        this.fname = fname;
        this.lname = lname;
        this.sid = sid;
    }
}

public class Week7Arrays {
    public static void main(String args[])
    {
        int x[],y,z[];

        int p[] ={10,20,30,40,50};

        System.out.println("p[1] : "+p[1]);
        //System.out.println("p[1] : "+p[5]); //ArrayIndexOutOfBoundsException

        for(int i : p)
        {
            System.out.println(i);
        }

        String[] strings = {"A","B","C","D","E"};
        String[] strings1 = new String[5]; //Declaring a string array
        for(String i : strings)
            System.out.println(i);


    }
}
