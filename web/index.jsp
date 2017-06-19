<%-- 
    Document   : index
    Created on : 25-may-2017, 16:15:47
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<html lang="es">
  <head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, minimun-scale=1.0"/>
    <link rel="stylesheet" href="css/styles.css"/>
    <link href="https://file.myfontastic.com/SR6VKQnjH8vuZHiwZsNSd9/icons.css" rel="stylesheet"/>
    <title>Bienvenidos | Ferreteria</title>
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
              <li><a href="index.jsp" class="selected">inicio</a></li>
              <li><a href="nosotros.jsp">nosotros</a></li>
              <li><a href="productos.jsp">productos</a></li>
              <li><a href="contacto.jsp">contacto</a></li>
            </ul>
          </nav>
        </div>
      </div>
    </header>
    <div class="l-slider">
      <div class="ed-container">
        <div class="ed-item">
          <img src="img/banner.jpg"/>
        </div>
      </div>
    </div>
    <div class="l-main ed-container">
      <div class="ed-item">
        <h2 class="productos__title">Productos destacados</h2>
        <div class="productos-container">
          <div class="productos">
            <div class="producto">
              <h3 class="producto__title">Esmalte</h3><a href="esmalte.jsp"><img src="img/smalte.jpg" class="producto__img"/></a>
              <p class="producto__price icon-cart">$12.00</p>
            </div>
            <div class="producto">
              <h3 class="producto__title">Aerosol</h3><a href="aerosol.jsp"><img src="img/aerosol.jpg" class="producto__img"/></a>
              <p class="producto__price icon-cart">$12.00</p>
            </div>
            <div class="producto">
              <h3 class="producto__title">Pistola de Calor</h3><a href="pistola.jsp"><img src="img/pistola_de_calor.jpg" class="producto__img"/></a>
              <p class="producto__price icon-cart">$12.00</p>
            </div>
            <div class="producto">
              <h3 class="producto__title">ElectroSierra</h3><a href="electrosierra.jsp"><img src="img/electrosierra.jpg" class="producto__img"/></a>
              <p class="producto__price icon-cart">$12.00</p>
            </div>
            <div class="producto">
              <h3 class="producto__title">Atornillador</h3><a href="atornillador.jsp"><img src="img/atornillador.jpg" class="producto__img"/></a>
              <p class="producto__price icon-cart">$12.00</p>
            </div>
            <div class="producto">
              <h3 class="producto__title">Acondicionador</h3><a href="acondicionador.jsp"><img src="img/acondicionador.jpg" class="producto__img"/></a>
              <p class="producto__price icon-cart">$12.00</p>
            </div>
          </div>
        </div>
      
      </div>
    </div>
   
    <script src="js/scripts.js"></script>
  </body>
</html>