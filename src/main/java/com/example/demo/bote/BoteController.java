package com.example.demo.bote;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.tools.GenericController;

@RestController
@RequestMapping("/api/botes")
public class BoteController extends GenericController<Bote>{
//	@SuppressWarnings("unused")
//	@Autowired
//	private BoteService boteService;

}
