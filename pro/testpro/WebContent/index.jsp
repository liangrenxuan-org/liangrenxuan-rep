<%@page import="com.alibaba.fastjson.JSON"%>
<%@page import="entity.City"%>
<%@page import="java.util.List"%>
<%@page import="dao.CityDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		CityDao cd = new CityDao();
		List<City> cityList = cd.getCityList();
		String cityJsonStr = JSON.toJSONString(cityList);
		out.print(cityJsonStr);
	%>
</body>
</html>