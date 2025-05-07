<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html><body>
<h2>Authors List</h2>
<a href="/authors/new">Add New Author</a>
<ul>
<c:forEach items="${authors}" var="a">
    <li>${a.name}</li>
</c:forEach>
</ul>
</body></html>
