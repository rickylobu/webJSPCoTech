package web;

import datos.DepartamentoDaoJDBC;
import dominio.Departamento;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ControladorDepartamento", value = "/ControladorDepartamento")
public class ControladorDepartamento extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String accion = request.getParameter("accion");

        if(accion != null) {

            switch(accion) {
                case "editar":
                    break;
                case "eliminar":
                    break;
                case "mostrar":
                    break;
            }
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void mostrar(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        List<Departamento> departamentos = new DepartamentoDaoJDBC().listar();
        System.out.println("Departamentos = " + departamentos);
        HttpSession session = request.getSession();

        session.setAttribute("departamentos",departamentos);
        //session.setAttribute("Total departamentos",departamentos.size());

        String jspListar = "admin_departamentos.jsp";
        request.getRequestDispatcher(jspListar).forward(request,response);
    }

}
