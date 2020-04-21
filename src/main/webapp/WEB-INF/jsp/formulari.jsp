<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page import="java.util.*" %>
<%@ page errorPage="/WEB-INF/jsp/error.jsp" %>
<!DOCTYPE html>
<html lang="ca">
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
${2+2}
<div class="container" >
<form action="/desarPrevisio" method="post">
    <div class="form-group">
        <label for="dia">Dia</label>
        <input name="dia" type="date" class="form-control" id="dia" aria-describedby="dia" placeholder="Entra el dia">
    </div>
    <div class="form-group">
        <label for="temps">Temps</label>
        <select name="temps" class="form-control" id="temps" aria-describedby="temps">
            <option value="Solejat">Solejat</option>
            <option value="Nuvolat">Nuvolat</option>
            <option value="Pluja">Pluja</option>
            <option value="Vents forts">Vents forts</option>
            <option value="Boira">Boira</option>
            <option value="Tormenta">Tormenta</option>
        </select>
    </div>
    <div class="form-group">
        <label for="temperatura">Temperatura</label>
        <input name="temperatura" type="number" class="form-control" id="temperatura" aria-describedby="temperatura" placeholder="Entra la temperatura">
    </div>

    <button type="submit" class="btn btn-primary">Submit</button>
</form>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</div>
</body>

</html>