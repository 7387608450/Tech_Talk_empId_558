<!DOCTYPE html>
<html lang="en">
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

  <h3 style="color:red" align="center">Add Tech Talk</h3><br><br>
  <form class="form-horizontal" action="../AddTicTocServlet" method="post" >
    <div class="form-group" align="center">
      <label class="control-label col-sm-2" for="email">Id:</label>
      <div class="col-sm-3">
        <input type="text" class="form-control" id="email" placeholder="Enter Id" name="id">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="pwd4">Date:</label>
      <div class="col-sm-3">          
        <input type="text" class="form-control" id="pwd4" placeholder="Enter date" name="date">
      </div>
    </div>
     <div class="form-group">
      <label class="control-label col-sm-2" for="pwd3">Title:</label>
      <div class="col-sm-3">          
        <input type="text" class="form-control" id="pwd3" placeholder="Enter title" name="title">
      </div>
    </div>
     <div class="form-group">
      <label class="control-label col-sm-2" for="pwd2">Description:</label>
      <div class="col-sm-3">          
        <input type="text" class="form-control" id="pwd2" placeholder="Enter desc" name="desc">
      </div>
    </div>
     <div class="form-group">
      <label class="control-label col-sm-2" for="pwd1">Presentor:</label>
      <div class="col-sm-3">          
        <input type="text" class="form-control" id="pwd1" placeholder="Enter Presentor" name="presentor">
      </div>
    </div>
    

    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-success">Add Tic Toc</button>
      </div>
    </div>
  </form>

</div>
<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

    <script src="resources/js/index.js"></script>
</body>
</html>
