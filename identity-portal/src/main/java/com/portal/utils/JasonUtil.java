package com.portal.utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import edu.hziee.common.lang.StringUtil;

/**
 * Jsaon字符与对象互转工具类
 * 20181113
 * */
public class JasonUtil {

  public static <T extends Object> String object2JSONString(T obj) {
      if (obj == null) {
        return null;
      }

      return  JSONArray.toJSONString(obj);
  }

  public static  <T extends Class> Object jasonString2Object(String jasonString, T tClass) {
      if (StringUtil.isBlank(jasonString)) {
          return  null;
      }

      JSONObject jSONObject = JSONArray.parseObject(jasonString);
      return JSONObject.toJavaObject(jSONObject, tClass);
  }

}
