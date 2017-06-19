package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"es\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\"/>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, minimun-scale=1.0\"/>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/styles.css\"/>\n");
      out.write("    <link href=\"https://file.myfontastic.com/SR6VKQnjH8vuZHiwZsNSd9/icons.css\" rel=\"stylesheet\"/>\n");
      out.write("    <title>Bienvenidos | ED Styles</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <header class=\"l-header\">\n");
      out.write("      <div class=\"ed-container\">\n");
      out.write("        <div class=\"ed-item\">\n");
      out.write("          <a href=\"/\"><img src=\"dist/img/logo.png\" class=\"logo\"/></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"ed-item\">\n");
      out.write("          <div id=\"open-menu\" class=\"hasta-web icon-menu\"></div>\n");
      out.write("          \n");
      out.write("          <nav id=\"menu\" class=\"menu-container\">\n");
      out.write("            <div id=\"close-menu\" class=\"icon-close hasta-web\"></div>\n");
      out.write("            <ul class=\"ed-menu web-horizontal\">\n");
      out.write("              <li><a href=\"/\" class=\"selected\">inicio</a></li>\n");
      out.write("              <li><a href=\"nosotros.html\">nosotros</a></li>\n");
      out.write("              <li><a href=\"productos.html\">productos</a></li>\n");
      out.write("              <li><a href=\"contacto.html\">contacto</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </nav>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </header>\n");
      out.write("    <div class=\"l-slider\">\n");
      out.write("      <div class=\"ed-container\">\n");
      out.write("        <div class=\"ed-item\">\n");
      out.write("          <img src=\"img/banner.jpg\"/>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"l-main ed-container\">\n");
      out.write("      <div class=\"ed-item\">\n");
      out.write("        <h2 class=\"productos__title\">Productos destacados</h2>\n");
      out.write("        <div class=\"productos-container\">\n");
      out.write("          <div class=\"productos\">\n");
      out.write("            <div class=\"producto\">\n");
      out.write("              <h3 class=\"producto__title\">Polo ED Clásico</h3><a href=\"polo-ed2.html\"><img src=\"dist/img/ed2.jpg\" class=\"producto__img\"/></a>\n");
      out.write("              <p class=\"producto__price icon-cart\">$12.00</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"producto\">\n");
      out.write("              <h3 class=\"producto__title\">Polo ED Standard</h3><a href=\"polo-ed1.html\"><img src=\"dist/img/ed1.jpg\" class=\"producto__img\"/></a>\n");
      out.write("              <p class=\"producto__price icon-cart\">$12.00</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"producto\">\n");
      out.write("              <h3 class=\"producto__title\">Polo CSS Desde Cero</h3><a href=\"polo-css.html\"><img src=\"dist/img/css.jpg\" class=\"producto__img\"/></a>\n");
      out.write("              <p class=\"producto__price icon-cart\">$12.00</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"producto\">\n");
      out.write("              <h3 class=\"producto__title\">Polo HTML5 Desde Cero</h3><a href=\"polo-html.html\"><img src=\"dist/img/html.jpg\" class=\"producto__img\"/></a>\n");
      out.write("              <p class=\"producto__price icon-cart\">$12.00</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"producto\">\n");
      out.write("              <h3 class=\"producto__title\">Polo JavaScript Desde Cero</h3><a href=\"polo-js.html\"><img src=\"dist/img/js.jpg\" class=\"producto__img\"/></a>\n");
      out.write("              <p class=\"producto__price icon-cart\">$12.00</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"producto\">\n");
      out.write("              <h3 class=\"producto__title\">Polo PHP Desde Cero</h3><a href=\"polo-php.html\"><img src=\"dist/img/php.jpg\" class=\"producto__img\"/></a>\n");
      out.write("              <p class=\"producto__price icon-cart\">$12.00</p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <h2 class=\"sociales__title\">Síguenos y enterate de más</h2>\n");
      out.write("        \n");
      out.write("        <div class=\"sociales\"><a href=\"http://facebook.com\" class=\"icon-facebook\"></a><a href=\"http://twitter.com\" class=\"icon-twitter\"></a><a href=\"http://instagram.com\" class=\"icon-instagram\"></a><a href=\"http://pinterest.com\" class=\"icon-pinterest\"></a></div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <footer class=\"l-footer\">\n");
      out.write("      <div class=\"ed-container\">\n");
      out.write("        <div class=\"ed-item\">\n");
      out.write("          <p>Escuela Digital | 2010 - 2016</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </footer>\n");
      out.write("    <script src=\"js/scripts.js\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
