package controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.*;
import model.Retangulo;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse reponse) throws ServletException, IOException {
		//1. Procesamos parametros
		
		//2. Criamos os JavaBeans
		Retangulo rec = new Retangulo(3, 6);
		
		//3. Adicionamos o javabean a algum escopo
		request.setAttribute("mensagem", "Saudações do servlet");
		
		HttpSession session = request.getSession();
		/*Name key and value. Key search for JSP, value search for java class*/
		session.setAttribute("retangulo", rec);
		
		//4. Redirecionar para visualização selecionada
		RequestDispatcher dispatcher = request.getRequestDispatcher("vista/implantarVariaveis.jsp");
		dispatcher.forward(request, reponse);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse reponse) {
		
	}

}
