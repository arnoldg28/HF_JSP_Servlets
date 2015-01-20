<%@ page import="java.util.*" %>

<html>
	<body>
		<h1 align="center">Sizes JSP</h1>
		<p>
		<%
			String[] sizes = (String[])request.getAttribute("sizes");
			for(int x=0;x<sizes.length;x++){
				out.print("<br>Sizes: "+ (String)sizes[x]);
			}
		%>
	</body>
</html>