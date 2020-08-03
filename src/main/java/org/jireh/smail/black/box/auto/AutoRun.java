package org.jireh.smail.black.box.auto;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import org.jireh.smail.black.box.auto.bean.AccountInfo;
import org.jireh.smail.black.box.auto.common.utils.PathUtil;

public class AutoRun {

    private static String accountJsonPath;
    private static AccountInfo accountInfo;

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        System.out.println(args[1]);
        try {
            if (args.length != 0) {
                accountJsonPath = args[0];
                init();
            }
        } catch (Exception e) {
            //读取配置异常
            e.printStackTrace();
        }

        System.out.println("等着吧");
    }

    private static void init() {
        String accountJsonStr = PathUtil.readJsonFile(accountJsonPath);
        accountInfo = new Gson().fromJson(accountJsonStr,AccountInfo.class);
    }
}
