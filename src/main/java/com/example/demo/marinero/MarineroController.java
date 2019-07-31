package com.example.demo.marinero;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.tools.GenericController;

@RestController
@RequestMapping("/api/marineros")
public class MarineroController extends GenericController<Marinero>{
	
}
