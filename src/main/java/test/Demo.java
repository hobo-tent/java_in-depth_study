package test;

import java.util.ArrayList;

public class Demo {
    Byte[] array=new Byte[1*1024*1024];

    public static void main(String[] args) {
        ArrayList<Demo> list = new ArrayList<>();
        int count=0;
        try{
            while (true){
                list.add(new Demo());
                count++;
            }
        }catch (Exception e){
            System.out.println("count:"+count);
            e.printStackTrace();
        }

    }
}
