<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="report.Dao,report.ill"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>疫情信息</title>
  </head>
  
  <body>
  <table border="1">
      <tr>
          <td>ID</td>
          <td>疑似</td>
          <td>确诊</td>
          <td>日期</td>
      </tr>
        <%
           Dao dao=new Dao();
           List<ill> list =dao.readIll();    
           for(ill tl:list)
           {%>
          <tr>
              <td><%=tl.getId() %></td>
              <td><%=tl.getContact()%>></td>
              <td><%=tl.getConfirm() %>></td>
              <td><%=tl.getDate() %></td>
          </tr>
            <%}
       %>
  </table>
  </body>
</html>