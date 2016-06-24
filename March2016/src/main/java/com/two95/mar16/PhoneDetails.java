package com.two95.mar16;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.two95.mar16.uday.PhonePojo;

@Controller
public class PhoneDetails {
	@RequestMapping(value= "/phoneDetails",method = RequestMethod.GET)
    public String getPhoneDetails(){
		return "phonedetails";
	}	
	@RequestMapping(value="/phoneDetails",method = RequestMethod.POST)
	/*public String insertPhoneDetails(@RequestParam Map<String,String> map,Model model){
	       String modeli = map.get("modeli");
	       String os = map.get("os");
	       String memory = map.get("memory");
		
		model.addAttribute("modeli",modeli);
		model.addAttribute("os",os);
		model.addAttribute("memory",memory);{
		return "displayphone";
	}*/
	public String insertPhoneDetails(@ModelAttribute("iphone") PhonePojo phonepojo){
		return "displayphone";
}
}

