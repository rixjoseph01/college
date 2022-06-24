package com.example.collegeadm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.collegeadm.Contact;
import com.example.collegeadm.ContactRepository;
import com.example.collegeadm.Course;
import com.example.collegeadm.CourseRepository;
import com.example.collegeadm.PgRepository;
import com.example.collegeadm.ReportUgCourse;
import com.example.collegeadm.Studentpg;
import com.example.collegeadm.Studentug;
import com.example.collegeadm.UgRepository;
import com.example.collegeadm.User;
import com.example.collegeadm.UserRepository;

@Controller
public class HomeController {
@Autowired	
private UserRepository repo;
@Autowired
private UgRepository ugrepo;
@Autowired
private PgRepository pgrepo;
@Autowired
private ContactRepository cprepo;
@Autowired
private CourseRepository courserepo;

	@RequestMapping("/")
	public String home() {
		return "index";
	}
	@GetMapping("/signup")
	public String hsignup(Model model) {
		model.addAttribute("user", new User());
		return "signup";
	}

	@PostMapping("/process_signup")
	public String processSignup(User user) {
		
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		String encodedPassword=encoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		//System.out.println(user.getSname());
		repo.save(user);
		return "signin";
		
	}
	@GetMapping("/signin")
	public String hsignin() {
		return "signin";
	}


	@GetMapping("/about")
	public String habout() {
		return "about";
	}
	@GetMapping("/contact")
	public String contactform(Model model) {
		model.addAttribute("contactobject", new Contact());
		return "/contact";
	}
	
	@PostMapping("/contactsave")
	public String addContact(Contact contactobject) {
		//System.out.println(contactobject.getFname());
		cprepo.save(contactobject);
		return "index";
		
	}
	

	@GetMapping("/student/index")
	public String shome() {
		return "/student/index";
	}
	
//	@GetMapping("/signup")
//	public String hsignup(Model model) {
//		model.addAttribute("user", new User());
//		return "signup";
//	}
	
	@GetMapping("/student/ugapplicationform")
	public String ugappform(Model model) {
		model.addAttribute("studentprofile", new Studentug());
		return "/student/ugapplicationform";
	}
	
	@PostMapping("/profile")
	public String addUG(Studentug studentprofile) {
		System.out.println(studentprofile.getFname());
		ugrepo.save(studentprofile);
		return "/student/index";
		
	}
	
	@GetMapping("/student/pgapplicationform")
	public String pgappform(Model model) {
		model.addAttribute("studentprofile", new Studentpg());
		return "/student/pgapplicationform";
	}
	
	@PostMapping("/profilepg")
	public String addUG(Studentpg studentprofile) {
		System.out.println(studentprofile.getFname());
		pgrepo.save(studentprofile);
		return "/student/index";
		
	}

	@GetMapping("/admin/index")
	public String ahome() {
		return "/admin/index";
	}
	
	@GetMapping("/admin/addcourse")
	public String addcourse(Model model) {
		model.addAttribute("course_add", new Course());
		return "/admin/addcourse";
	}
	@PostMapping("/courseadd")
	public String saveCourse(Course course_add) {
		courserepo.save(course_add);
		return "/admin/index";
		
	}
	
	
	@GetMapping("/admin/reportcourse")
	public String reportco(Model model) {
		model.addAttribute("reugpgcourse", new ReportUgCourse());
		return "/admin/reportcourse";
	}
}