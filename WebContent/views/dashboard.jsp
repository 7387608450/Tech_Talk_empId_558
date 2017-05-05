<!DOCTYPE html>
<html lang="en">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
  <link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">

  
      <link rel="stylesheet" href="resources/css/style.css">
</head>
<body>

<div class="form">
  <!-- <div class="jumbotron"> -->
    <h1>Welcome:${requestScope.name}</h1>      
  
  <!-- </div>  -->
  

<a href="views/userrequestfortictoc.jsp"><button type="button" class="btn btn-success"> Do Request For Tic Toc</button></a>
<div align="right"> <a href="index.jsp"><button type="button" class="btn btn-warning">LogOut</button></a></div>

   

<br><br><br>
<div align="center">

	<form method="post" action="RegisterForSpecificTicToc">
	
	<table border="3" >
	<tr style="color:green;">
		<td>ID</td>
		<td>DATE</td>
		<td>TITLE</td>
		<td>DESC</td>
		<td>PRESENTOR</td>
		<td></td>
		<td>Status</td>
		
			
	</tr>
  <c:forEach items="${list}" var="item">
    <tr>
      <td style="color:white" width="20%" align="center"><c:out value="${item.getId()}" /></td>
       <td style="color:white" width="20%" align="center"><c:out value="${item.getDate()}" /></td>
        <td style="color:white" width="20%" align="center"><c:out value="${item.getTitle()}" /></td>
         <td style="color:white" width="20%" align="center"><c:out value="${item.getDesc()}" /></td>
          <td style="color:white" width="20%" align="center"><c:out value="${item.getPresentor()}" /></td>
              <td><button type="submit" class="btn btn-success" name="register" value="${item.getId()}">Register</button></td>
              <td style="color:white" width="10%" align="center">${requestScope.id}</td>
           
    </tr>
  </c:forEach>
</table>
</form>
</div>
</div>
 <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

    <script src="resources/js/index.js"></script>
</body>
</html>
