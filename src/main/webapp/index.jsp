<html>
	<head>
		<meta charset="utf-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Login</title>
		<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
	</head>
	<body>
		<div class="container">
			<h2>Prueba Login!!!</h2>
			<form action="Login.do" method="post" class="form-horizontal" role="form">
				<div class="form-group">
				    <label for="ejemplo_email_3" class="col-lg-2 control-label">Username</label>
				    <div class="col-lg-10">
                                        <input type="text" class="form-control" name="username" placeholder="Nombre de Usuario" required>
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="ejemplo_password_3" class="col-lg-2 control-label">Password</label>
				    <div class="col-lg-10">
				      <input type="password" class="form-control" name="password" placeholder="Contraseña" required>
				    </div>
				  </div>
				<div class="form-group">
				    <div class="col-lg-offset-2 col-lg-10">
				      <button type="submit" class="btn btn-default">Iniciar Sesión</button>
				    </div>
				  </div>
			</form>
		</div>
		
		<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	    <!-- Include all compiled plugins (below), or include individual files as needed -->
	    <script src="js/bootstrap.min.js"></script>
	</body>
</html>
