package emp.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Command;

import emp.model.EmpDao;

public class HrListCommand implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		EmpDao ed = EmpDao.getInstance();
		
		return null;
	}

}