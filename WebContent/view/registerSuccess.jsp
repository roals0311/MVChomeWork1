<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>


<h1>You registerd succeddfully.</h1>

	<%-- JSP Expression Language --%>

	<ul>
		<li>Id: ${customer.id }</li>
		<li>password: ${customer.password}</li>
		<li>gender: ${customer.gender}</li>
		<li>Name: ${customer.name }</li>
		<li>Email: ${customer.email }</li>
</ul>

<p>
<a href="/MVChomeWork1/index.jsp"> go to home page</a>
</p>

</body>
</html>