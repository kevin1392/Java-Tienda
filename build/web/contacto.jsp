<%-- 
    Document   : contacto
    Created on : 25-may-2017, 16:27:28
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, minimun-scale=1.0"/>
    <link rel="stylesheet" href="css/styles.css"/>
    <link href="https://file.myfontastic.com/SR6VKQnjH8vuZHiwZsNSd9/icons.css" rel="stylesheet"/>
    <title>Contacto | Ferreteria</title>
  </head>
  <body>
    <header class="l-header">
      <div class="ed-container">
        <div class="ed-item">
          <a href="index.jsp"><img src="img/logo.png" class="logo"/></a>
        </div>
        <div class="ed-item">
          <div id="open-menu" class="hasta-web icon-menu"></div>
          
          <nav id="menu" class="menu-container">
            <div id="close-menu" class="icon-close hasta-web"></div>
            <ul class="ed-menu web-horizontal">
              <li><a href="index.jsp">inicio</a></li>
              <li><a href="nosotros.jsp">nosotros</a></li>
              <li><a href="productos.jsp">productos</a></li>
              <li><a href="contacto.jsp" class="selected">contacto</a></li>
            </ul>
          </nav>
        </div>
      </div>
    </header>
    <div class="l-main ed-container">
      <div class="ed-item">
        <h1>Contacto</h1>
        <form class="ed-container web-60 contact-form" action="respuesta.jsp" name="flogin" id="flogin" method="POST">
          <div class="ed-item web-30">
            <label for="nombre">Nombres y apellidos</label>
          </div>
          <div class="ed-item web-70">
            <input type="text" name="correo" id="nombre"/>
          </div>
          <div class="ed-item web-30">
            <label for="correo">Correo electrónico</label>
          </div>
          <div class="ed-item web-70">
            <input type="email" name="correo" id="correo"/>
          </div>
          <div class="ed-item">
            <label for="mensaje">Su mensaje</label>
          </div>
          <div class="ed-item">
            <textarea name="mensaje" id="mensaje"></textarea>
          </div>
          <div class="ed-item">
            <input type="submit" value="Enviar"/>
          </div>
        </form>
      </div>
    </div>
   
   
    <script src="js/scripts.js"></script>
  </body>
</html>