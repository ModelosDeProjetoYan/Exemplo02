
package action;

import controller.Action;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Contato;
import model.Empresa;
import persistence.ContatoDAO;
import persistence.EmpresaDAO;


public class FormContatoAction implements Action {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
      
             request.setAttribute("empresas", EmpresaDAO.getInstance().loadAll());
             RequestDispatcher view = request.getRequestDispatcher("/GravarContato.jsp");
             view.forward(request, response);
    }
    
}
