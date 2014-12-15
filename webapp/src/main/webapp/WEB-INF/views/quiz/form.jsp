<%@ page import="be.tedd.sandpit.webapp.mvc.form.QuizForm" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
Quiz:
<form:form action="/webapp/app/quiz/form" method="post" commandName="quizForm">
    <table>
        <tr>
            <td>Enter a number between <%=QuizForm.NUMBER_MIN%> and <%=QuizForm.NUMBER_MAX%>:</td>
            <td><form:input path="number" /></td>
            <td class="formError"><form:errors path="number" /></td>
        </tr>
        <tr>
            <td>Enter between <%=QuizForm.TEXT_MIN_SIZE%> and <%=QuizForm.TEXT_MAX_SIZE%> characters:</td>
            <td><form:input path="text" /></td>
            <td class="formError"><form:errors path="text" /></td>
        </tr>
        <tr>
            <td>Select the tick box:</td>
            <td><form:checkbox path="state"/></td>
            <td class="formError"><form:errors path="state" /></td>
        </tr>
        <tr>
            <td>Pick my favourite colour:</td>
            <td>
                <form:select path="colour">
                    <form:options/>
                </form:select>
            </td>
            <td class="formError"><form:errors path="colour" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="I think my answers are good!" />
            </td>
        </tr>
    </table>
</form:form>