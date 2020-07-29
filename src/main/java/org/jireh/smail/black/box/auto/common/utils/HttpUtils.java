package org.jireh.smail.black.box.auto.common.utils;

import org.jireh.smail.black.box.auto.common.constant.CommonConstant;
import org.springblade.core.http.util.HttpUtil;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 请求工具类
 *
 * @author Jireh
 */
public class HttpUtils {

	public static boolean get(String address){
        Map<String, String> heard = new HashMap<>();
        heard.put("Cookie", "pkey="+CommonConstant.SMALL_BLACK_BOX_PKEY);
        heard.put("Content-Type","application/x-www-form-urlencoded");
        heard.put("Host","api.xiaoheihe.cn");
        heard.put("Referer","http://api.maxjia.com/");
        heard.put("User-Agent","Mozilla/5.0 AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2272.118 Safari/537.36 ApiMaxJia/1.0");

        Map<String, Object> params = new HashMap<>();
        params.put("heybox_id", CommonConstant.SMALL_BLACK_BOX_HEYBOX_ID);
        params.put("imei", CommonConstant.SMALL_BLACK_BOX_IMEI);
        params.put("os_type", CommonConstant.SMALL_BLACK_BOX_OS_TYPE);
        params.put("os_version", CommonConstant.SMALL_BLACK_BOX_OS_VERSION);
        params.put("version", CommonConstant.SMALL_BLACK_BOX_VERSION);
        String time =CommonUtil.getNowTime();
        params.put("_time", time);
//        params.put("hkey", getHKey(time,signListApi));
        params.put("channel", CommonConstant.SMALL_BLACK_BOX_CHANNEL);
        String res = HttpUtil.get(CommonConstant.SMALL_BLACK_BOX_API_HOST + address, heard, params);
        System.out.println(res);

        return true;
    }
}
