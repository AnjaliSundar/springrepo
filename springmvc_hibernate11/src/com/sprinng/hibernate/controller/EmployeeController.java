package com.sprinng.hibernate.controller;



@Controller
public class EmployeeController {
	@Autowired
	
	private EmployeeService employeeService;
	@RequestMapping(value ="/home", method = RequestMethod.GET)
   public ModelAndView("index")
}

}
