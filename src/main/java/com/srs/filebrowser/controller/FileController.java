package com.srs.filebrowser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.srs.filebrowser.service.FileService;

@Controller
@RequestMapping("/file")
public class FileController {
	@Autowired
	private FileService fileService;
	
	@GetMapping
	public ModelAndView handleRequest() {
		ModelAndView model = new ModelAndView("fileList");
		model.addObject("fileList", fileService.getRootDirectories());
		//model.addObject("parent")
		return model;
	}
	
	@GetMapping("/folder")
	public ModelAndView getFiles(@RequestParam("path") String path) {
		ModelAndView model = new ModelAndView("fileList");
		model.addObject("fileList", fileService.listFiles(path));
		return model;
	}
}
