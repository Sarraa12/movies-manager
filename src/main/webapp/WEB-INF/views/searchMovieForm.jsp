<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
          integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
            integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
            crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"
            integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut"
            crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"
            integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k"
            crossorigin="anonymous"></script>
</head>
<body>
<%@include file="home.jsp" %>
<div class="container">
    <div class="row" style="margin-top: 40px">
        <div class="col-1"></div>
        <div class="col-10" style="padding-bottom: 20px"><h2>Find your movie</h2></div>
        <div class="col-1"></div>
    </div>
    <div class="row">
        <div class="col-1"></div>
        <div class="col-6">
            <form:form modelAttribute="searchMovieForm" method="post">
                <div class="form-group">
                    <form:errors path="*"/>
                </div>
                <div class="form-group">
                    <form:label path="originalName">Original name</form:label>
                    <form:input path="originalName" class="form-control"/>
                </div>
                <div class="form-group">
                    <form:label path="polishName">Polish name</form:label>
                    <form:input path="polishName" class="form-control"/>
                </div>
                <div class="form-group">
                    <form:label path="">From</form:label>
                    <form:input path="startYear" type="date" class="form-control"/>
                </div>
                <div class="form-group">
                    <form:label path="endYear">To</form:label>
                    <form:input path="endYear" type="date" class="form-control"/>
                </div>
                <div class="form-group">
                    <form:label path="country">Country</form:label>
                    <form:input path="country" class="form-control"/>
                </div>
                <button class="btn btn-primary" type="submit">Search</button>
                <button class="btn btn-secondary" type="reset">Clear</button>
            </form:form>
        </div>
        <div class="col-5"></div>
    </div>
</div>
</body>
</html>