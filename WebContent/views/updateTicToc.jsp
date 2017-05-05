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

    <h3 align="center" style="color:red;">Welcome: Admin</h3>      
  
  
  

<a href="ListOfCandidateSelfRequested"><button type="button" class="btn btn-success">Self Requested</button></a>
<a href="views/addtictoc.jsp"><button type="button" class="btn btn-success">Add Tic Toc</button></a>


<div align="right"> <a href="index.jsp"><button type="button" class="btn btn-warning">LogOut</button></a></div>



<br><br><br>


	<form  method="post" action="DeleteTicToc" >
	<h4 style="color:green;" align="center" >This is edit menu ....please edit field and click Update Button....</h4>
	<table border="2" >
	<tr style="color:green;">
		<td>ID</td>
		<td>DATE</td>
		<td>TITLE</td>
		<td>DESC</td>
		<td>PRESENTOR</td>
		<td></td>
		
		
			
	</tr>
  <c:forEach items="${list}" var="item">
    <tr>
      <td style="color:white" width="20%" align="center"><c:out value="${item.getId()}"/></td>
       <td style="color:white" width="20%" align="center"><c:out value="${item.getDate()}" /></td>
        <td style="color:white" width="20%" align="center"><c:out value="${item.getTitle()}" /></td>
         <td style="color:white" width="20%" align="center"><c:out value="${item.getDesc()}" /></td>
          <td style="color:white" width="20%" align="center"><c:out value="${item.getPresentor()}"  /></td>
       
            
         
         
    </tr>
  </c:forEach>
</table>
<h3 style="color:green;"> Enter new Entry For above entry</h3>
    
</form>
	<form action="UpdateServlet" method="post">
		<table border="2" >
		<tr style="color:green;">
		<td style="color:white" width="20%" align="center">ID</td>
		<td style="color:white" width="20%" align="center">DATE</td>
		<td style="color:white" width="20%" align="center">TITLE</td>
		<td style="color:white" width="20%" align="center">DESC</td>
		<td style="color:white" width="20%" align="center">PRESENTOR</td>
		<td></td>
	</tr>
	<tr>
	<td ><input name="newid"></td>
	<td><input name="newdate"></td>
	<td><input name="newtitle"></td>
	<td><input name="newdesc"></td>
	<td><input name="newpresentor"></td>
	
	</tr>
	   <button type="submit" class="btn btn-success" name="update"  align="center">Update</button>

 		</table>    
 		
 		</form>	  
</div>
<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

    <script src="resources/js/index.js"></script>
</body>
</html>
