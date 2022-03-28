package com.ams.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ams.entities.Etudiant;


@Controller
public class FirstController {
	
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
	@RequestMapping("/list")
	public String etudiants(Model m)
	
	{
		ArrayList <Etudiant> students=new ArrayList<>();
		
		students.add (new Etudiant ( "achref", 25, "achref_kouki@gmail.com", "52782354","mourouj"));
		students.add (new Etudiant ( "Mahdi", 21, "mahdi@gmail.com", "6587499","ben arous"));
		students.add (new Etudiant ( "taoufik", 26, "taoufik@gmail.com", "8745965","zahra"));
		
		m.addAttribute("students", students);
		
		return "home/etudiants";
	}
	
	
	@RequestMapping("/add")
	public String addetudiants()
	
	{

		
		return "home/AddStudient";
	}
	
	
	}


