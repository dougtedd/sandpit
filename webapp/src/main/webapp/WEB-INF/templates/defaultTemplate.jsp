<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sandbox webapp</title>
        <link rel="stylesheet" href="<c:url value="/resources/css/default.css"/>" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <tiles:insertAttribute name="header" />
            <tiles:insertAttribute name="menu" />
            <div id="body">
                <tiles:insertAttribute name="body" />
            </div>
            <tiles:insertAttribute name="footer" />
        </div>
    </body>
</html>
