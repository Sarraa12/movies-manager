<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page import="java.time.LocalDate" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
          integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
    <title>All trips</title>
</head>
<body>
<%@include file="home.jsp" %>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<style>
    table {
        border-collapse: collapse;
    }

    th, td {
        border: 1px solid black;
    }
</style>
<h2>The list of all movies</h2>
<br>
<div class="container-fluid">
    <div class="row">
        <div class="col">
            <table class="table">

                <tr>
                    <th>Id</th>
                    <th>Original name</th>
                    <th>Polish name</th>
                    <th>Year</th>
                    <th>Location</th>
                    <th>Action</th>
                </tr>
                <c:forEach items="${moviesList}" var="movie">
                    <tr>
                        <td>${movie.id}</td>
                        <td>${movie.originalName}</td>
                        <td>${movie.polishName}</td>
                        <td>${movie.premiereDate}</td>
                        <td>${movie.locations}</td>
                        <td>
                            <sec:authorize access="hasRole('ADMIN')">
                            <p><a href=http://localhost:8080/movies/delete/${movie.id}>Delete</a></p>
                            <p><a href=http://localhost:8080/movies/update/${movie.id}>Update</a></p>
                            </sec:authorize>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</div>

</body>
</html>