<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
Body of the home page.<br/>
<c:url value="/app/quiz/form" var="formLink"/>
<a href="${formLink}">Try a quiz</a>