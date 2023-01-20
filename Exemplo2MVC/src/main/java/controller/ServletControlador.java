package controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.*;
import model.Retangulo;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1. Procesamos parametros
		String action = request.getParameter("action");
		
		//2. Criamos os JavaBeans
		Retangulo recRequest = new Retangulo(1,2);
		Retangulo recSession = new Retangulo(3, 4);
		Retangulo recApplication = new Retangulo(5,6);
		
		//3. Adicionamos o javabean a algum escopo
		/*Revisamos a action fornecida*/
		if("adicionaVariaveis".equals(action)) {
			//Alcance request
			request.setAttribute("retanguloRequest", recRequest);
			//Alcance session
			HttpSession session = request.getSession();
			session.setAttribute("retanguloSession", recSession);
			
			//Alcance application
			ServletContext application = this.getServletContext();
			application.setAttribute("retanguloApplication", recApplication);
			
			//Mandamos uma mensagem
			request.setAttribute("mensagem", "As variáveis foram adicionadas");
			//Redirecionar o JSP ao index
			request.getRequestDispatcher("index.jsp").forward(request, response); 
		}
		
		else if("listarVariaveis".equals(action)) {
			//4. Redirecionamos ao JSP que pega as variaveis
			request.getRequestDispatcher("WEB-INF/alcanceVariaveis.jsp").forward(request, response);
		}
		else {
			//5. Redirecionamos a página de inicio
			request.setAttribute("mensagem", "Action não fornecida ou desconhecida");
			request.getRequestDispatcher("index.jsp").forward(request, response); 
			
			//Desse modo também direciona à uma páginas mas não é possível passar informações,
			//já que não propaga os objetos request e response:
			//response.sendRedirect("index.jsp");
		}
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse reponse) {
		
	}

}
