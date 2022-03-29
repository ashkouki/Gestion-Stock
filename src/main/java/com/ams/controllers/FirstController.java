package com.ams.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ams.entities.Etudiant;


@Controller
public class FirstController {
	
	
	static 		ArrayList <Etudiant> students=new ArrayList<>();
	
	static {

		
		students.add (new Etudiant ( "achref", 25, "achref_kouki@gmail.com", "52782354","mourouj"));
		students.add (new Etudiant ( "Mahdi", 21, "mahdi@gmail.com", "6587499","ben arous"));
		students.add (new Etudiant ( "taoufik", 26, "taoufik@gmail.com", "8745965","zahra"));
		
	
	}
	
	
	
	@RequestMapping("/first")
	public String  home(Model m)
	{/*
		String nom="Achref kouki";
		String universite="ENSI";
		String email="achrefkouki9@gmail.com";
	String tel="52782354";
      m.addAttribute("name",nom); 
      m.addAttribute("universty",universite );
      m.addAttribute("tel", tel);
      m.addAttribute("email", email);
      */
    String tab[]= {"achref","kouki","GN"};
    
    m.addAttribute("tab", tab);
		return "/home/app";
		
	}

	@RequestMapping("/add")
	public String addetudiants()
	
	{

		
		return "home/AddStudient";
	}
	
	@RequestMapping("list")

	public String etudiants(Model m)
	
	{
	m.addAttribute("students",students);
			
			return "home/etudiants";	
	}
	
	
	
	@PostMapping("/save")
	//@ResponseBody
	public String savetudiants
	(
			@RequestParam("nom")String nom,
			@RequestParam("age")int age,
			@RequestParam("email")String email,
			@RequestParam("adresse")String adresse,
			@RequestParam("tel")String  tel
			
			)
	{

		Etudiant temp=new Etudiant(nom,age,email,adresse,tel);
		
		 temp.toString();
		
		students.add(temp);
		
		return "redirect:list";
		
		//return "vous avez taper" +nom+" "+tel+" "+email+" "+adresse+" "+age;
	
	}
	
	@GetMapping("/delete/{email}")
	@ResponseBody
	public String deleteetudiants(@PathVariable("email")String mail)
	
	{

		
		return "email"+mail;
	}
	
	
	}


