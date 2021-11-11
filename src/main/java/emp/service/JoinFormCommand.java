package emp.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Command;

public class JoinFormCommand implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
	
		return "/empView/joinForm.jsp";
	}

}
