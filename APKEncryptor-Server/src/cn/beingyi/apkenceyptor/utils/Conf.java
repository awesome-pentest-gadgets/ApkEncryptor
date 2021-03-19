package cn.beingyi.apkenceyptor.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Conf {
    public static String ConfPath="/root/beingyi.conf";

    static Properties pro;
    static {
        pro = new Properties();
        FileInputStream in;
        try {
            in = new FileInputStream(new File(ConfPath));
            pro.load(in);
            in.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static String getDB_URL() {

        return "jdbc:mysql://localhost:3306/"+pro.getProperty("DB_NAME")+"?useUnicode=true&characterEncoding=utf-8&useSSL=true&allowMultiQueries=false";
    }

    public static String getDB_USER() {

        return pro.getProperty("DB_USER");
    }

    public static String getDB_PASS() {

        return pro.getProperty("DB_PASS");
    }

    public static String getPath() {

        return pro.getProperty("RootPath");
    }

    public static String getUrl() {

        return pro.getProperty("RootURL");
    }


    public static String getSign(){
        return "3082033b30820223a00302010202043674f31f300d06092a864886f70d01010b0500304e310b3009060355040613023836310b300906035504081302594e310b300906035504071302514a310b3009060355040a13024259310b3009060355040b13024259310b3009060355040313025a59301e170d3139303532383033343735325a170d3439303532303033343735325a304e310b3009060355040613023836310b300906035504081302594e310b300906035504071302514a310b3009060355040a13024259310b3009060355040b13024259310b3009060355040313025a5930820122300d06092a864886f70d01010105000382010f003082010a028201010091de2ba9aced361fa436317827351100b2fe5ab5d34b4b5eb08bb5883272ec12c0a2fb31182be11eef4bba95b99fde308f446a51ff12ddc9f329a1927a7c61c176fbc9bf80bbe3490198b4c11dcca48143307afbfe820ebe1b8091302ae6ec2b7b5049ea53ce45ab9a2c67b731d00d9ee574bd3513fd71af929c4fe66d0dacea426ee0955c10e5a02bf6cc58290afc5ab3e04ed50d235bab86c15d315a8c392adb460de41ea3a005c1064cf6e68601ff73f7f84a4c778209fdd76eeee63b62debeed239cc85610ab0296302649e35218d52bb218d353ea0f88355dc2639c64f7789bcad9a4fcf0515efbd8ca9b43863f48cf2719b4fec869cd9a272a9882efa30203010001a321301f301d0603551d0e04160414b008c3c7023e8de0051f42cd03d33400a3964785300d06092a864886f70d01010b0500038201010076232e6f157bedf3e35e27602b682008ced97a3fd2644bb615a61da73fcd34c1edb50e9f989a1adf7d27e28f628bc43961ea416e0b0f1f8a984eb9e9b8881f51c5e6fd08e300d0f41f5d56f5c35b67314d34817160d8f018e4d4f74e6c245fbe581f3789df1564154796d1869a3a42ac8af8a6288172bd0791192949574729ee18903f96de803140713353ce96fe48b9a34cfb98fcf351ba9248c421463c09596432400d13e709bbcc6fe36789c3c128a5f0400f5be33cf2856c0db411a05534b65271b8cb455ea726833b5704722959e9c944a635f98119f599f8a017b17ef8514f6cf9d3f1a9bfae3fe5c54dfa3ddbb3d89153d8b781dd8a512186c2ecee9d";
    }

}
