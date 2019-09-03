package config.util;

import java.util.*;

/**
 * @Description 将蛇形map字段转换为驼峰
 * @author:awei
 * @date:2019/8/24
 * @ver:1.0
 **/
public class FormatMapDemo {

    public static Map formatMap(Map map){
        Map<String, Object> newMap = getStringObjectMap(map);
        return newMap;
    }

    private static Map<String, Object> getStringObjectMap(Map map) {
        Map<String, Object> newMap = new HashMap(16);
        Set<Map.Entry<String, Object>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Object>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Object> entry = iterator.next();
            String key = entry.getKey();
            Object value = entry.getValue();
            String newKey = formatKey(key);
            newMap.put(newKey, value);
        }
        return newMap;
    }

    public static List formatMap(List<Map<String, Object>> list){
        List<Map> list1 = new ArrayList<Map>(10);
        for (Map map : list) {
            Map<String, Object> newMap = getStringObjectMap(map);
            list1.add(newMap);
        }
        return list1;
    }

    private static String formatKey(String key){
        key = key.toLowerCase();
        String[] strings = key.split("_");
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        for (String string:strings) {
            if (i==0){
                stringBuffer.append(string);
                i++;
                continue;
            }
            i++;
            String upperCase = string.substring(0, 1).toUpperCase();
            stringBuffer.append(upperCase);
            stringBuffer.append(string.substring(1));
        }
        return stringBuffer.toString();
    }
}
