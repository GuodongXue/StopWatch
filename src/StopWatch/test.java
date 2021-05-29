package StopWatch;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test {

    DateFormat df = new SimpleDateFormat("hh:mm:ss");

    public static void main(String[] args) throws InterruptedException {
        //加入死循环
        while(true){
            //获取当前时间
            Date d = new Date();
            //System.out.println(d);

            //将时间按照我的自定义格式
            DateFormat df = new SimpleDateFormat("hh:mm:ss");
            String strDate = df.format(d);
            System.out.println(strDate);
            //停顿一秒
            Thread.sleep(1000);
        }
    }
}
