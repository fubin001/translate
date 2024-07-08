package com.example.apaar97.translate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GlobalVars {
    public static String BASE_REQ_URL = "https://translate.yandex.net/api/v1.5/tr.json/";
    public static final String BAIDU_API = "http://api.fanyi.baidu.com/api/trans/vip/translate";
    public static final String APP_ID = "20240503002041227";
    public static final String SECRET="tVM4CPQACaqHYRr_YVSE";
    public static final String SALT= "123456";
    public static ArrayList<String> LANGUAGE_ITEMS = new ArrayList<String>();
    static {
        LANGUAGE_ITEMS.add("中文");
        LANGUAGE_ITEMS.add("英文");
        LANGUAGE_ITEMS.add("越文");
        LANGUAGE_ITEMS.add("泰文");
    }

    public static Map<String, String> LANGUAGE_CODE_MAPPING = new HashMap<>();
    static {
        LANGUAGE_CODE_MAPPING.put("中文", "zh");
        LANGUAGE_CODE_MAPPING.put("英文", "en");
        LANGUAGE_CODE_MAPPING.put("越文", "vie");
        LANGUAGE_CODE_MAPPING.put("泰文", "th");
    }
    public static int DEFAULT_LANG_POS = 0;
    public GlobalVars(){}
}
