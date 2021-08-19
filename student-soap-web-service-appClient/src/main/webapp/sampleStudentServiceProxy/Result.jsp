<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleStudentServiceProxyid" scope="session" class="com.sks.StudentServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleStudentServiceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleStudentServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleStudentServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.sks.StudentService getStudentService10mtemp = sampleStudentServiceProxyid.getStudentService();
if(getStudentService10mtemp == null){
%>
<%=getStudentService10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 15:
        gotMethod = true;
        boolean addStudent15mtemp = sampleStudentServiceProxyid.addStudent();
        String tempResultreturnp16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addStudent15mtemp));
        %>
        <%= tempResultreturnp16 %>
        <%
break;
case 18:
        gotMethod = true;
        boolean deleteStudent18mtemp = sampleStudentServiceProxyid.deleteStudent();
        String tempResultreturnp19 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteStudent18mtemp));
        %>
        <%= tempResultreturnp19 %>
        <%
break;
case 21:
        gotMethod = true;
        com.sks.Student[] getAllStudent21mtemp = sampleStudentServiceProxyid.getAllStudent();
if(getAllStudent21mtemp == null){
%>
<%=getAllStudent21mtemp %>
<%
}else{
        String tempreturnp22 = null;
        if(getAllStudent21mtemp != null){
        java.util.List listreturnp22= java.util.Arrays.asList(getAllStudent21mtemp);
        tempreturnp22 = listreturnp22.toString();
        }
        %>
        <%=tempreturnp22%>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>