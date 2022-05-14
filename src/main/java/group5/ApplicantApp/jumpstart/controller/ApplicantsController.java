package group5.ApplicantApp.jumpstart.controller;

import java.util.List;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import group5.ApplicantApp.jumpstart.entities.Applicant;
import group5.ApplicantApp.jumpstart.entities.Login;
import group5.ApplicantApp.jumpstart.service.ApplicantsService;
import group5.ApplicantApp.jumpstart.service.LoginService;

@Controller
public class ApplicantsController {

	@Autowired
	private ApplicantsService applicantsService;
	
	@GetMapping("/")
	public String dashboard()
	{
		return "home";
	}
	
//	@GetMapping("/login")
//	public String loginPage()
//	{
//		return "login";
//	}
//	
	
	// display list of applicants
	@GetMapping("/hrPage")
	public String viewHomePage(Model model) {
		return findPaginated(1, "afirstName", "asc", model);		
	}
	
	@GetMapping("/showApplicantForm")
	public String showApplicantForm(Model model) {
		// create model attribute to bind form data
		Applicant applicant = new Applicant();
		model.addAttribute("applicant", applicant);
		return "applicant_user";
	}
	
	@PostMapping("/saveApplicant")
	public String saveApplicant(@ModelAttribute("applicant") Applicant applicant) {
		// save applicants to database
		applicantsService.saveApplicant(applicant);
		return "redirect:/hrPage";
	}
	
	@PostMapping("/createApplicant")
	public String createApplicant(@ModelAttribute("applicant") Applicant applicant,HttpServletRequest request) {
		
		//Save Contact Person Details to database
		String[] conName = request.getParameterValues("conName");
		String[] conNum = request.getParameterValues("conNum");
		String[] conRelation = request.getParameterValues("conRelation");
		String[] conAddress = request.getParameterValues("conAddress");
		
		for(int i = 0; i < conName.length; i++)
		{
			applicant.addConPerson(conName[i], conNum[i], conRelation[i], conAddress[i]);
		}
		
		//Save Spouse Details to database
		String[] spouseName = request.getParameterValues("spouseName");
		String[] spouseOccup = request.getParameterValues("spouseOccup");
		String[] spouseComp = request.getParameterValues("spouseComp");
		String[] spouseAge = request.getParameterValues("spouseAge");
				
		for(int i = 0; i < spouseName.length; i++)
		{
			applicant.addSpouse(spouseName[i], spouseOccup[i], spouseComp[i], spouseAge[i]);
		}
		
		//Save Dependent Details to database
		String[] depName1 = request.getParameterValues("depName1");
		String[] depAge1 = request.getParameterValues("depAge1");
		String[] depRelation1 = request.getParameterValues("depRelation1");
		String[] depName2 = request.getParameterValues("depName2");
		String[] depAge2 = request.getParameterValues("depAge2");
		String[] depRelation2 = request.getParameterValues("depRelation2");
		String[] depName3 = request.getParameterValues("depName3");
		String[] depAge3 = request.getParameterValues("depAge3");
		String[] depRelation3 = request.getParameterValues("depRelation3");
						
		for(int i = 0; i < depName1.length; i++)
		{
			applicant.addDependent(depName1[i], depAge1[i], depRelation1[i], depName2[i], depAge2[i], depRelation2[i], depName3[i], depAge3[i], depRelation3[i]);
		}		

		//Save Family Details to database
		String[] fbfatherName = request.getParameterValues("fbfatherName");
		String[] fbfatherOccup = request.getParameterValues("fbfatherOccup");
		String[] fbfatherComp = request.getParameterValues("fbfatherComp");
		String[] fbfatherAge = request.getParameterValues("fbfatherAge");
		String[] fbmotherName = request.getParameterValues("fbmotherName");
		String[] fbmotherOccup = request.getParameterValues("fbmotherOccup");
		String[] fbmotherComp = request.getParameterValues("fbmotherComp");
		String[] fbmotherAge = request.getParameterValues("fbmotherAge");
		String[] fbNumSiblings = request.getParameterValues("fbNumSiblings");
		String[] fbBirthOrder = request.getParameterValues("fbBirthOrder");
								
		for(int i = 0; i < fbfatherName.length; i++)
		{
			applicant.addFamily(fbfatherName[i], fbfatherOccup[i], fbfatherComp[i], fbfatherAge[i], fbmotherName[i], fbmotherOccup[i], fbmotherComp[i], fbmotherAge[i], fbNumSiblings[i], fbBirthOrder[i]);
		}		
		
		//Save Education Details to database
		String[] educNameGS = request.getParameterValues("educNameGS");
		String[] educYrsGS = request.getParameterValues("educYrsGS");
		String[] educDegreeGS = request.getParameterValues("educDegreeGS");
		String[] educAchievementGS = request.getParameterValues("educAchievementGS");
		String[] educNameHS = request.getParameterValues("educNameHS");
		String[] educYrsHS = request.getParameterValues("educYrsHS");
		String[] educDegreeHS = request.getParameterValues("educDegreeHS");
		String[] educAchievementHS = request.getParameterValues("educAchievementHS");
		String[] educNameCS = request.getParameterValues("educNameCS");
		String[] educYrsCS = request.getParameterValues("educYrsCS");
		String[] educDegreeCS = request.getParameterValues("educDegreeCS");
		String[] educAchievementCS = request.getParameterValues("educAchievementCS");
		String[] educNameMS = request.getParameterValues("educNameMS");
		String[] educYrsMS = request.getParameterValues("educYrsMS");
		String[] educDegreeMS = request.getParameterValues("educDegreeMS");
		String[] educAchievementMS = request.getParameterValues("educAchievementMS");
		
		for(int i = 0; i < educNameGS.length; i++)
		{
			applicant.addEducBg(educNameGS[i], educYrsGS[i], educDegreeGS[i], educAchievementGS[i], educNameHS[i], educYrsHS[i], educDegreeHS[i], educAchievementHS[i], educNameCS[i], educYrsCS[i], educDegreeCS[i], educAchievementCS[i], educNameMS[i], educYrsMS[i], educDegreeMS[i], educAchievementMS[i]);
		}		
		
		//Save Thesis Details to database
		String[] thesisSubj = request.getParameterValues("thesisSubj");
		String[] thesisTitle = request.getParameterValues("thesisTitle");
		String[] thesisProgLang = request.getParameterValues("thesisProgLang");
		String[] thesisDesc = request.getParameterValues("thesisDesc");
		String[] thesisRole = request.getParameterValues("thesisRole");
		String[] thesisTName = request.getParameterValues("thesisTName");
		String[] thesisContactNum = request.getParameterValues("thesisContactNum");
		String[] thesisGrade = request.getParameterValues("thesisGrade");
		
		for(int i = 0; i < thesisSubj.length; i++)
		{
			applicant.addThesis(thesisSubj[i], thesisTitle[i], thesisProgLang[i], thesisDesc[i], thesisRole[i], thesisTName[i], thesisContactNum[i], thesisGrade[i]);
		}	
		
		//Save Extracurricular Details to database
		String[] extraActOne = request.getParameterValues("extraActOne");
		String[] extraActOneRole = request.getParameterValues("extraActOneRole");
		String[] extraActTwo = request.getParameterValues("extraActTwo");
		String[] extraActTwoRole = request.getParameterValues("extraActTwoRole");
				
		for(int i = 0; i < extraActOne.length; i++)
		{
			applicant.addExtraCurr(extraActOne[i], extraActOneRole[i], extraActTwo[i], extraActTwoRole[i]);
		}		
		
		//Save Work Experience Details to database
		String[] wrkCompOne = request.getParameterValues("wrkCompOne");
		String[] wrkOne_dur = request.getParameterValues("wrkOne_dur");
		String[] wrkOne_pos = request.getParameterValues("wrkOne_pos");
		String[] wrkOne_sal = request.getParameterValues("wrkOne_sal");
		String[] wrkOne_dirtSV = request.getParameterValues("wrkOne_dirtSV");
		String[] wrkOne_reasonfl = request.getParameterValues("wrkOne_reasonfl");
		String[] wrkCompTwo = request.getParameterValues("wrkCompTwo");
		String[] wrkTwo_dur = request.getParameterValues("wrkTwo_dur");
		String[] wrkTwo_pos = request.getParameterValues("wrkTwo_pos");
		String[] wrkTwo_sal = request.getParameterValues("wrkTwo_sal");
		String[] wrkTwo_dirtSV = request.getParameterValues("wrkTwo_dirtSV");
		String[] wrkTwo_reasonfl = request.getParameterValues("wrkTwo_reasonfl");
		String[] wrkCompThree = request.getParameterValues("wrkCompThree");
		String[] wrkThree_dur = request.getParameterValues("wrkThree_dur");
		String[] wrkThree_pos = request.getParameterValues("wrkThree_pos");
		String[] wrkThree_sal = request.getParameterValues("wrkThree_sal");
		String[] wrkThree_dirtSV = request.getParameterValues("wrkThree_dirtSV");
		String[] wrkThree_reasonfl = request.getParameterValues("wrkThree_reasonfl");
		String[] wrk_carPlanDesc = request.getParameterValues("wrk_carPlanDesc");
		String[] wrk_dateAvail = request.getParameterValues("wrk_dateAvail");
		String[] wrk_expectedSal = request.getParameterValues("wrk_expectedSal");
		String[] wrk_willTT = request.getParameterValues("wrk_willTT");
						
		for(int i = 0; i < wrkCompOne.length; i++)
		{
			applicant.addWorkExp(wrkCompOne[i], wrkOne_dur[i], wrkOne_pos[i], wrkOne_sal[i], wrkOne_dirtSV[i], wrkOne_reasonfl[i],
					  			   wrkCompTwo[i], wrkTwo_dur[i], wrkTwo_pos[i], wrkTwo_sal[i], wrkTwo_dirtSV[i], wrkTwo_reasonfl[i],
					  			   wrkCompThree[i],wrkThree_dur[i], wrkThree_pos[i], wrkThree_sal[i], wrkThree_dirtSV[i], wrkThree_reasonfl[i],
					  			   wrk_carPlanDesc[i], wrk_dateAvail[i], wrk_expectedSal[i], wrk_willTT[i]);
		}	
		
		//Save Conviction Details to database
		String[] prevConvic = request.getParameterValues("prevConvic");
		String[] convicDetails = request.getParameterValues("convicDetails");
		String[] convicUnderDrugT = request.getParameterValues("convicUnderDrugT");
		String[] convicDTReason = request.getParameterValues("convicDTReason");
						
		for(int i = 0; i < prevConvic.length; i++)
		{
			applicant.addConviction(prevConvic[i], convicDetails[i], convicUnderDrugT[i], convicDTReason[i]);
		}		
		
		//Save References Details to database
		String[] refNameOne = request.getParameterValues("refNameOne");
		String[] refOneComp = request.getParameterValues("refOneComp");
		String[] refOnePos = request.getParameterValues("refOnePos");
		String[] refOneRel = request.getParameterValues("refOneRel");
		String[] refOneContactNum = request.getParameterValues("refOneContactNum");
		String[] refNameTwo = request.getParameterValues("refNameTwo");
		String[] refTwoComp = request.getParameterValues("refTwoComp");
		String[] refTwoPos = request.getParameterValues("refTwoPos");
		String[] refTwoRelation = request.getParameterValues("refTwoRelation");
		String[] refTwoContactNum = request.getParameterValues("refTwoContactNum");
		String[] refNameThree = request.getParameterValues("refNameThree");
		String[] refThreeComp = request.getParameterValues("refThreeComp");
		String[] refThreePos = request.getParameterValues("refThreePos");
		String[] refThreeRelation = request.getParameterValues("refThreeRelation");
		String[] refThreeContactNum = request.getParameterValues("refThreeContactNum");
						
		for(int i = 0; i < refNameOne.length; i++)
		{
			applicant.addReferences(refNameOne[i], refOneComp[i], refOnePos[i], refOneRel[i], refOneContactNum[i],
					refNameTwo[i], refTwoComp[i], refTwoPos[i], refTwoRelation[i], refTwoContactNum[i],
					refNameThree[i], refThreeComp[i], refThreePos[i], refThreeRelation[i], refThreeContactNum[i]);
		}		
						
		applicantsService.saveApplicant(applicant);
		return "redirect:/";
	}
	
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable ( value = "id") long id, Model model) {
		
		// get applicant from the service
		Applicant applicant = applicantsService.getApplicantById(id);
		
		// set applicant as a model attribute to pre-populate the form
		model.addAttribute("applicant", applicant);
		return "update_applicant";
	}
	
	@GetMapping("/deleteApplicant/{id}")
	public String deleteApplicant(@PathVariable (value = "id") long id) {
		
		// call delete employee method 
		this.applicantsService.deleteApplicantById(id);
		return "redirect:/hrPage";
	}

	@GetMapping("/page/{pageNo}")
	public String findPaginated(@PathVariable (value = "pageNo") int pageNo, 
			@RequestParam("sortField") String sortField,
			@RequestParam("sortDir") String sortDir,
			Model model) {
		int pageSize = 5;
		
		Page<Applicant> page = applicantsService.findPaginated(pageNo, pageSize, sortField, sortDir);
		List<Applicant> listApplicants = page.getContent();
		
		model.addAttribute("currentPage", pageNo);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("totalItems", page.getTotalElements());
		
		model.addAttribute("sortField", sortField);
		model.addAttribute("sortDir", sortDir);
		model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");
		
		model.addAttribute("listApplicants", listApplicants);
		return "index";
	}
	
	//login controller
	
//	@Autowired
//    private LoginService userService;
//                       
//    @GetMapping("/login")
//          
//    public ModelAndView login() {
//     ModelAndView mav = new ModelAndView("login");
//        mav.addObject("user", new Login());
//        return mav;
//    }
// 
//    @PostMapping("/login")
//    public String login(@ModelAttribute("user") Login user ) {
//     Login oauthUser = userService.login(user.getEmail(), user.getPassword());
//     System.out.print(oauthUser);
//     if(Objects.nonNull(oauthUser)){
//    	 return "redirect:/hrPage";
//     } else {
//     return "redirect:/login";
//     }
//}
//    
//    @RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
//    public String logoutDo(HttpServletRequest request,HttpServletResponse response)
//    {
//        return "redirect:/login";
//    }
}