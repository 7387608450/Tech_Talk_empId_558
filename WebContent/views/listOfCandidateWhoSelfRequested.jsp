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
  
    <h1>Welcome: Admin</h1>      
  

  


<div align="right"> <a href="#"><button type="button" class="btn btn-success">Back</button></a></div>


<br><br><br>


	
	
	<table border="2" >
	<tr style="color:green;">
		<td>EmailID</td>
		<td>TITLE</td>
		<td>DATE</td>
		
		<td></td>
		<td></td>
		
			
	</tr>
  <c:forEach items="${list}" var="item">
    <tr>
      <td style="color:white" width="20%" align="center"><c:out value="${item.getEmailId()}" /></td>
       <td style="color:white" width="20%" align="center"><c:out value="${item.getTopic()}" /></td>
        <td style="color:white" width="20%" align="center"><c:out value="${item.getDate()}" /></td>
         
          <td><button type="button" class="btn btn-success">Approve</button></td>
            <td><button type="button" class="btn btn-danger">Reject</button></td>
    </tr>
  </c:forEach>
</table>
</div>

<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

    <script src="resources/js/index.js"></script>
</body>
</html>
