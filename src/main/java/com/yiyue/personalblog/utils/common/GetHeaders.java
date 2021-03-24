package com.yiyue.personalblog.utils.common;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: GetHeaders
 * @Author:TanLongYue
 * @Description 用于获取Request 请求里面Header的信息
 * @Date Created in 2020/10/29 20:16
 * @Modified By
 */
public class GetHeaders {

    public static Map<String, Object> getHeaders(HttpServletRequest request) {
        Map<String, Object> headerMap = new HashMap<String, Object>();
        Enumeration<?> er = request.getHeaderNames();//获取请求头的所有name值
        String headerName;
        while(er.hasMoreElements()){
            headerName = er.nextElement().toString();
            headerMap.put(headerName, request.getHeader(headerName));
        }
        return headerMap;
    }
}
